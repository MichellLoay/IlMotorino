/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ilmotorino;

/**
 *
 * @author fulls
 */
public class IlMotorino {

    /**
     * @param args the command line arguments
     */
     private String color;
     private String model;
     private float vel;
     private float varVel;
     private boolean antifurto;
     //creiamo il costrutto della classe
     public IlMotorino(String color, String model, float vel){
         //inizializzamo gli attributo come valori passati come argomenti
         this.color = color;
         this.model = model;
         this.vel = vel;
         this.varVel = varVel;
         this.antifurto = false; //inizializzamo a false
     }
     
     public float getVel(){
         return vel;
     }
     
     public void acellera(float varVel){
           if (!antifurto) { // Verifica se l'antifurto è disabilitato
            vel += varVel; // Aggiunge il valore specificato alla velocità
        }
     }
     
     public void inseritAntifurto(){
         if (vel == 0){// assegna un valore true all’attributo antifurto solo se la velocità è pari a zero
             antifurto = true;
         }
     }
     
     public void disinserisciAntifurto(){
         //assegna un valore false all’attributo antifurto;
         antifurto = false;
     }
     
     public String toString(){// restituisce una stringa contenente le informazioni principali dell'oggetto.
        return " modello: "+this.model+ ", colore: " +this.color+ ", velocità: " +vel+ "km, antifurto: "+antifurto;//METTERE SEMPRE + JNASJKXB +
     }
}
