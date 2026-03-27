/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package serverrest;

/**
 * Entry point dell'applicazione Calcolatrice REST
 * 
 * @author delfo
 */
public class App {

    /**
     * @param args the command line arguments
     */
    private static final int PORTA_DEFAULT = 8080;

    public static void main(String[] args) {
        int porta = PORTA_DEFAULT;

        if (args.length > 0) {
            try {
                porta = Integer.parseInt(args[0]);
                if (porta < 1 || porta > 65535) {
                    System.err.println("Porta fuori range, uso porta default 8080");
                    porta = PORTA_DEFAULT;
                }
            } catch (NumberFormatException e) {
                System.err.println("Porta non valida, uso porta default 8080");
                porta = PORTA_DEFAULT;
            }
        }

        ServerRest.avviaServer(porta);
    }

}
