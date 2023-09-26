/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_amirault;

import java.util.Scanner;

/**
 *
 * @author Amiraulot Clémence TDB TP1 26/09/23
 */
public class TP1_manipNombresInt_Amirault {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
                Scanner sc = new Scanner(System.in);
      System.out.println("\n saisir un entier :");
      n1=sc.nextInt(); // On demande a sc de donner le prochain entier
      
      int n2; 
        sc = new Scanner(System.in);
      System.out.println("\n Entrer le deuxième entier :");
      n2=sc.nextInt(); // On demande a sc de donner le prochain entier
      
    
      
      
      System.out.println("la somme est :" + n1+n2 + "\n la différence est :" + n1/n2 + "\n leur produit :" + n1*n2 );
      
      System.out.println("affiche : "+ n1/n2);
      System.out.println( n1%n2);
    }
}

    

    
    

