/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author Amirault Clémence TDB Exo 2 25/09/23
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Declaration des variables
      int nb;
      Scanner sc = new Scanner(System.in);
      System.out.println("\n Entrer le nombre :");
      nb=sc.nextInt(); // On demande a sc de donner le prochain entier  
      int result; // resultat
      int ind; //indice
      result=0;
      
      //Addition des nb premiers entiers
      ind=1;
      while (result<= nb) {
          result=result+ind;
      }
      
      //Affichage du resultat
      System.out.println();
      System.out.println("la somme des"+ nb+"entiers est:"+result);
}
              
              
    }
    
