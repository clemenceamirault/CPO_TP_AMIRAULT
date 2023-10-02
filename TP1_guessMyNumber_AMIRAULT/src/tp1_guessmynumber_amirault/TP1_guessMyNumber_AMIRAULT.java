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
      int n = generateurAleat.nextInt(100);
      
      int g;
     Scanner sc = new Scanner (System.in);
     System.out.println("choisissez un nombre entre 0 et 100");
     g = sc.nextInt();
     
     int compt = 0;
     
     while (g != n){    
         if (g > 2*n) {
             System.out.println("ceci est beaucoup trop grand!");
             Scanner scbis = new Scanner (System.in);
             System.out.println("veuillez prendre un nouveau nombre entre 0 et 100");
             g = scbis.nextInt();
             compt += 1;
                  
         }
         
         if (g > n) {
            System.out.println("ceci est grand!");
            Scanner scbis = new Scanner (System.in);
            System.out.println("choisissez un autre nombre entre 0 et 100");
            g = scbis.nextInt();
            compt += 1;
         }
         
         if (g < n / 2) {
             System.out.println("ceci est beaucoup trop petit !");
             Scanner scbis = new Scanner( System.in);
             System.out.println("choisissez un autre nombre entre 0 et 100");
             g = scbis.nextInt();
             compt += 1;
         }
         
         if (g < n) {
             System.out.println("ceci est trop petit!");
             Scanner scbis = new Scanner (System.in);
             System.out.println("choisissez un autre nombre entre 0 et 100");
             g = scbis.nextInt();
             compt += 1;
         }

    }
    System.out.println("vous avez trouve le bon nombre au bout de " + compt + "tentative, bravo !");
}
}    

