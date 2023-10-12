/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_amirault;

import java.util.Scanner;

/**
 *
 * @author Amirault Clémence TDB TP2 12/10/2023
 */
public class TP2_convertisseurObjet_AMIRAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur convertisseur1 = new Convertisseur();
        Convertisseur convertisseur2 = new Convertisseur();

        convertisseur1.convertirFahrenheitEnCelsius(32.0);
        convertisseur1.convertirCelsiusEnFahrenheit(0.0);

        convertisseur2.convertirFahrenheitEnCelsius(100.0);
        convertisseur2.convertirCelsiusEnFahrenheit(25.0);

        System.out.println(convertisseur1);
        System.out.println(convertisseur2);
    
   
        Convertisseur convertisseur = new Convertisseur();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Convertir Fahrenheit en Celsius");
            System.out.println("2. Convertir Celsius en Fahrenheit");
            System.out.println("3. Afficher le nombre de conversions");
            System.out.println("4. Quitter");

            int choix = scanner.nextInt();

            if (choix == 1) {
                System.out.print("Entrez la température en Fahrenheit : ");
                double fahrenheit = scanner.nextDouble();
                convertisseur.convertirFahrenheitEnCelsius(fahrenheit);
            } else if (choix == 2) {
                System.out.print("Entrez la température en Celsius : ");
                double celsius = scanner.nextDouble();
                convertisseur.convertirCelsiusEnFahrenheit(celsius);
            } else if (choix == 3) {
                System.out.println(convertisseur);
            } else if (choix == 4) {
                break;
            } else {
                System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        }
    }
}
    

