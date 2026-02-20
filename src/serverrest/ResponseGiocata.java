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
    
    private Integer giocata;
    private String numeroUscito;
    private Boolean risultato;
    
    
    // Costruttore vuoto necessario per GSON
    public ResponseGiocata() {
    }
    
    // Costruttore con parametri

    public ResponseGiocata(Integer giocata, String numeroUscito, Boolean risultato) {
        this.giocata = giocata;
        this.numeroUscito = numeroUscito;
        this.risultato = risultato;
    }

    public Integer getGiocata() {
        return giocata;
    }

    public void setGiocata(Integer giocata) {
        this.giocata = giocata;
    }

    public String getNumeroUscito() {
        return numeroUscito;
    }

    public void setNumeroUscito(String numeroUscito) {
        this.numeroUscito = numeroUscito;
    }

    public Boolean getRisultato() {
        return risultato;
    }

    public void setRisultato(Boolean risultato) {
        this.risultato = risultato;
    }
   
    
}