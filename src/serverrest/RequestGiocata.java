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
    
    private Integer operando1;
    private Integer operando2;
    private String operatore;
    
    
    // Costruttore vuoto necessario per GSON
    public RequestGiocata() {
    }
    
    // Costruttore con parametri  
    public RequestGiocata(Integer operando1, Integer operando2, String operatore){
       this.operando1 = operando1;
       this.operando2 = operando2;
       this.operatore = operatore;
    }
    
    // Getter
  
    public Integer getOperando1() {
        return operando1;
    }

    public Integer getOperando2() {
        return operando2;
    }

    public String getOperatore() {
        return operatore;
    }
    //Setter

    public void setOperando1(Integer operando1) {
        this.operando1 = operando1;
    }

    public void setOperando2(Integer operando2) {
        this.operando2 = operando2;
    }

    public void setOperatore(String operatore) {
        this.operatore = operatore;
    }
    
    //toString

    @Override
    public String toString() {
        return "RequestGiocata{" + "operando1=" + operando1 + ", operando2=" + operando2 + ", operatore=" + operatore + '}';
    }
    
    
    
    
    
}