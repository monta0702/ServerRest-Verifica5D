/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class RouletteService {
    private static final int DISPARI = 0;
    private static final int PARI = 1;
    
    /**
     * Esegue l'operazione matematica richiesta
     * 
     * @param 
     * @param 
     * @param 
     * @return 
     * @throws IllegalArgumentException se ...
     */
    public static Integer logicaDiCalcolo(Integer giocata, String numeroUscito, Boolean risultato)
            throws IllegalArgumentException {

        // Controllo parametri
        if (!parametriValidi(giocata, numeroUscito)) {
            throw new IllegalArgumentException("Parametri non validi");
        }

        try {
            int n = Integer.parseInt(numeroUscito);

            
            boolean vittoria = false;
            if (n != 0) {
                if (giocata == DISPARI) {
                    vittoria = (n % 2 != 0);
                } else if (giocata == PARI) {
                    vittoria = (n % 2 == 0);
                } else {
                    throw new IllegalArgumentException("Opzione non valida. Opzione deve essere DISPARI(0) o PARI(1)");
                }
            }

            return vittoria ? 1 : 0;

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Opzione non valida. Numero deve essere un intero tra 0 e 36");
        }
    }

    private static boolean parametriValidi(Integer giocata, String numeroUscito) {
        if (giocata == null) return false;
        if (numeroUscito == null || numeroUscito.trim().isEmpty()) return false;

        try {
            int n = Integer.parseInt(numeroUscito);
            if (n < 0 || n > 36) return false;
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}
