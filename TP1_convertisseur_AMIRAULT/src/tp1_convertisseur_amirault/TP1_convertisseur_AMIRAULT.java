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
      System.out.println("\n Bonjour, saisissez une valeur:");
      tc=sc.nextDouble(); // On demande a sc une valeur pour les degrés 
      
      System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
      
       
       Scanner sd = new Scanner(System.in);
      System.out.println("\n 1- De Celcius vers Kelvin"+ "\n 2- De Kelvin vers Celcius" + "\n 3- De Farenheit vers celcius"+ "\n 4- De Kelvin vers Farenheit"+"\n 5- De Farenheit vers Kelvin" );
      tc=sd.nextDouble(); // On demande a sd d'afficher qu'elle formule choisir
       
        
        double app;
        app = CelciusVersKelvin(tc);
        System.out.println(app); // cela permet d'afficher le résultat du calcul
        
        double tk;
            System.out.println(tk = tc + 273);
            
        double tf;
           System.out.println(tf = tk*9/5-459.67);
        
        double app5;
        app5 = KelvinVersCelcius(tk);
        System.out.println(app5);
        
        double app2;
        app2 = FarenheitVersCelcius(tf);
        System.out.println(app2);
        
        double app3;
        app3 = KelvinVersFarenheit(tk);
        System.out.println(app3);
        
        double app4;
        app4 = FarenheitVersKelvin(tf);
        System.out.println(app4);
        
        
    }
    
    public static double CelciusVersKelvin(double tc) {
     double tk;
        tk = tc + 273;
        return tk;
    }
    
    public static double KelvinVersCelcius(double tk){
        double tc;
        tc = tk - 273;
        return tc;
    }
    
    public static double FarenheitVersCelcius(double tf) {
     double tc;
        tc = (tf-32)/1.8;   
        return tf;
    }
    
    public static double KelvinVersFarenheit (double tk) {
        double tf;
           tf = tk*9/5-459.67;
           return tk;      
    }
    
    public static double FarenheitVersKelvin(double tf) {
        double tk;
        tk = (tf-32)/1.8000+273.15;
        return tk;
                
    }
}
