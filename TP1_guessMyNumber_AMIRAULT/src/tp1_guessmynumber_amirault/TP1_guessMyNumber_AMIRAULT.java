/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_amirault;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Amirault Clémence TP1 TPB 01/10/23
 */
public class TP1_guessMyNumber_AMIRAULT {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) { 
      
      Random generateurAleat = new Random();
      
      // Générer et afficher cinq nombres aléatoires entre 1 et 100
        for (int i = 0; i < 5; i++) {
            int n = generateurAleat.nextInt(100); // Génère un nombre aléatoire entre 1 et 100 inclus
            System.out.println ("Nombre aleatoire #" + (i + 1) + ": " +generateurAleat);
    }
}
}    

