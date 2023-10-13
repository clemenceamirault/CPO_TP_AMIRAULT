/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_amirault;

/**
 *
 * @author user
 */
public class Voiture {
    String modele;
    String Marque;
    Personne proprietaire = null;
    int Puissance;
    
public Voiture (String unModele, String uneMarque, int unePuissance){
    modele = unModele;
    Marque = uneMarque;
    Puissance = unePuissance;
}  

@Override
public String toString(){
    String chaine ;
    
     chaine = "\n" +"Modele: " + modele + "\n" + " Marque: " + Marque + "\n" +" PuissanceCV: " + Puissance;
        return chaine;

}
    
}
