/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class RequestGiocata {
    
    private Integer giocata;
    private String numeroUscito;
    
    
    // Costruttore vuoto necessario per GSON
    public RequestGiocata() {
    }
    
    // Costruttore con parametri  

    public RequestGiocata(Integer giocata, String numeroUscito) {
        this.giocata = giocata;
        this.numeroUscito = numeroUscito;
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

    @Override
    public String toString() {
        return "RequestGiocata{" + "giocata=" + giocata + ", numeroUscito=" + numeroUscito + '}';
    }
}