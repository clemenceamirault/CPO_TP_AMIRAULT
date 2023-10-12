/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_amirault;

/**
 *
 * @author user
 */
public class Convertisseur {
    int nbConversions;
    
    public Convertisseur (){
        nbConversions = 0;
    }
    
        public void convertirFahrenheitEnCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        nbConversions++;
        System.out.println(fahrenheit + " degrés Fahrenheit équivalent à " + celsius + " degrés Celsius.");
    }

    public void convertirCelsiusEnFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        nbConversions++;
        System.out.println(celsius + " degrés Celsius équivalent à " + fahrenheit + " degrés Fahrenheit.");
    }
    
    @Override
    public String toString () {
        return "nb de conversions"+ nbConversions;
    }
}

