/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class ResponseGiocata {
    
    
    private String giocata;
    private String numero;
    private String vittoria;

    public ResponseGiocata() {
    }

    public ResponseGiocata(String giocata, String numero, String vittoria) {
        this.giocata = giocata;
        this.numero = numero;
        this.vittoria = vittoria;
    }

    public String getGiocata() {
        return giocata;
    }

    public void setGiocata(String giocata) {
        this.giocata = giocata;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getVittoria() {
        return vittoria;
    }

    public void setVittoria(String vittoria) {
        this.vittoria = vittoria;
    }   
}