/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculette.partie.pkg3;

import java.util.Scanner;

/**
 *
 * @author Amirault Clémence TP0 TDB 25/09/23
 */
public class CalculettePartie3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operateur;
        System.out.println("Please enter the operator:"+"\n1) add"+"\n2) substract"+"\n3) multiply"+"\n4) divide"+"\n5) modulo");
        int nb;
      Scanner sc = new Scanner(System.in);
      System.out.println("\n Entrer le nombre :");
      nb=sc.nextInt(); // On demande a sc de donner le prochain entier
      
      int operande1 = 0;
              Scanner m1 = new Scanner(System.in);
              System.out.println("\n Entrer le nombre :");
              nb=m1.nextInt();
    
      int operande2 = 0;
              Scanner m2 = new Scanner(System.in);
              System.out.println("\n Entrer le nombre :");
              nb=m2.nextInt(); 
              
       if (operateur= 1){
           System.out.println(operande1 + operande2);
       } else {
       }
       
       if (operateur=2) {
      System.out.println( operande1 - operande2);
       }
       
       if (operateur=3) {
       System.out.println( operande1 * operande2 );
       }
       
       if (operateur=4) {
       System.out.println( operande1 / operande2);
       }
       
       if ( operateur = 5 ) {
       System.out.println( operande1 % operande2);
       }
       
       if ( 1< operateur && operateur > 5) {
           System.out.println(" il faut choisir un nombre entre 1 et 5 ");
       }
    }
   
    
}
    

