/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_amirault;

/**
 *
 * @author Amirault TDB TP2 12/10/2023
 */
public class TP2_Bieres_AMIRAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ;
       uneBiere.nom = "Cuvée des trolls";
       uneBiere.degreAlcool = (float) 7.0 ;
       uneBiere.brasserie = "Dubuisson";
       uneBiere.ouverte = false;
       
       uneBiere.lireEtiquette();
       
       BouteilleBiere deuxBiere = new BouteilleBiere();
       deuxBiere.nom = "Leffe";
       deuxBiere.degreAlcool = (float) 6.6 ;
       deuxBiere.brasserie = "Abbaye de Leffe";
       
       deuxBiere.lireEtiquette ();
    }
    
}
