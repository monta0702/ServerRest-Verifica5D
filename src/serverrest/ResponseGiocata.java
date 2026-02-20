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
    
    private Integer numero1;
    private String giocata;
    private Boolean risultato;
    
    
    // Costruttore vuoto necessario per GSON
    public ResponseGiocata() {
    }
    
    // Costruttore con parametri
   
    public ResponseGiocata(Integer numero1, String giocata, Boolean risultato) {
        this.numero1 = numero1;
        this.giocata = giocata;
        this.risultato = risultato;
    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public String getGiocata() {
        return giocata;
    }

    public void setGiocata(String giocata) {
        this.giocata = giocata;
    }

    public Boolean getRisultato() {
        return risultato;
    }

    public void setRisultato(Boolean risultato) {
        this.risultato = risultato;
    }

}