/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_amirault;

import java.util.Scanner;

/**
 *
 * @author TP1 TDB AMIRAULT 03/10/2023
 */
public class TP1_stats_AMIRAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] tabfacedes = new int [6];
        Scanner sc = new Scanner (System.in);
        System.out.println("taper un nombre entier m :"); // demander à l'utilisateur de choisir un nombre
        int m = sc.nextInt();
        
        for (int i = 0; i<m; i++) {
            int result = (int) (Math.random()*6);
            
            tabfacedes[result]++;
        }
        
        System.out.println("resultat en pourcentage :");
        for (int i = 0; i<tabfacedes.length; i++) {
            double pour100 = (double) tabfacedes[i]/m*100;
            System.out.println("face"+ (i +1) + ":" + pour100 + "%");
        }
    }
    
}
