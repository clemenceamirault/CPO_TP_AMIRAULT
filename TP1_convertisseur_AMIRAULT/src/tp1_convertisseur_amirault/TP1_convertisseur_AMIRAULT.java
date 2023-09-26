/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_amirault;

import java.util.Scanner;

/**
 *
 * @author Amirault Clémence TDB TP1 26/09/23
 */
public class TP1_convertisseur_AMIRAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tc;
        Scanner sc = new Scanner(System.in);
      System.out.println("\n Entrer le nombre :");
      tc=sc.nextDouble(); // On demande a sc de donner le prochain entier
      
        double tk;
            System.out.println(tk = tc + 273);
        
        double app;
        app = CelciusVersKelvin(tc);
        System.out.println(app);
        
        double tf;
               
        double app2;
        app2 = FarenheitVersCelcius(tf);
        System.out.println(app2);
    }
    
    public static double CelciusVersKelvin(double tc) {
     double tk;
        tk = tc + 273;
        return tk;
    }
    
    public static double FarenheitVersCelcius(double tf) {
     double tc;
        tc = (tf-32)/1.8;   
        return tf;
    }
    
    public static double KelvinVersFarenheit (double tk) {
        
    }
}
