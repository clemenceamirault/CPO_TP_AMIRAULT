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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson") ;
       uneBiere.lireEtiquette();
       System.out.println(uneBiere) ;
       
       BouteilleBiere deuxBiere = new BouteilleBiere ("Leffe", (float) 6.6, "Abbaye de Leffe");
      
       deuxBiere.lireEtiquette ();
       deuxBiere.Decapsuler();
       System.out.println(deuxBiere) ;
       
       BouteilleBiere troisBiere = new BouteilleBiere ("IPA", (float) 5, "Effet Papillon");
       
       troisBiere.lireEtiquette();
       System.out.println(troisBiere) ;
       
       BouteilleBiere quatreBiere = new BouteilleBiere ("NEIPA", (float) 6, "Big Mountain Brewing");
       
       quatreBiere.Decapsuler();
       quatreBiere.lireEtiquette();
       System.out.println(quatreBiere) ;
       
       BouteilleBiere cinqBiere = new BouteilleBiere ("Blonde 57", (float) 5.6, "Manivelle");
       
       cinqBiere.lireEtiquette();
       System.out.println(cinqBiere) ;
    }
    
}
