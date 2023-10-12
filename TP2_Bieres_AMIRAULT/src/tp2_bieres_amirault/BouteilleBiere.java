/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_amirault;

/**
 *
 * @author user
 */
public class BouteilleBiere {
  private String nom;
  private float degreAlcool;
  private String brasserie;
  private boolean ouverte;
   

public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;
 
}
}