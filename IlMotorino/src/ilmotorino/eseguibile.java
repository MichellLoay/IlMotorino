/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ilmotorino;

/**
 *
 * @author fulls
 */
public class eseguibile {
    public static void main( String[] args){
        IlMotorino motorino1 = new IlMotorino("Arancione", "ducati", 0f);//dichiarazione
        System.out.println(motorino1.toString());//stapa valori iniziali
        //nuova velocita
        motorino1.acellera( 0.0f); //f dice che e un float si mette xx.xxf
        System.out.println(motorino1.toString());

        motorino1.inseritAntifurto();
        System.out.println(motorino1);
        //antifurto messo
        motorino1.disinserisciAntifurto();
        System.out.println(motorino1);
                
    }
}
