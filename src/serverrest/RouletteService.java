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
    private RouletteService() {
       
    }

    public static boolean logicaDiCalcolo(String giocata, String numero)
            throws IllegalArgumentException {

        if (!parametriValidi(giocata, numero)) {
            throw new IllegalArgumentException("Parametri non validi");
        }

        int n;
        try {
            n = Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Numero non valido. Deve essere un intero tra 0 e 36");
        }

        if (n < 0 || n > 36) {
            throw new IllegalArgumentException("Numero non valido. Deve essere compreso tra 0 e 36");
        }

        String giocataNormalizzata = giocata.trim().toUpperCase();

        if (!"PARI".equals(giocataNormalizzata) && !"DISPARI".equals(giocataNormalizzata)) {
            throw new IllegalArgumentException("Giocata non valida. Valori ammessi: PARI o DISPARI");
        }

        if (n == 0) {
            return false;
        }

        if ("PARI".equals(giocataNormalizzata)) {
            return n % 2 == 0;
        }

        return n % 2 != 0;
    }

    public static boolean parametriValidi(String giocata, String numero) {
        if (giocata == null || giocata.trim().isEmpty()) {
            return false;
        }

        if (numero == null || numero.trim().isEmpty()) {
            return false;
        }

        try {
            int n = Integer.parseInt(numero.trim());
            return n >= 0 && n <= 36;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
