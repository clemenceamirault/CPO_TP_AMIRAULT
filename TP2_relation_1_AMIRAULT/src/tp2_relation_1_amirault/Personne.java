/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_amirault;

/**
 *
 * @author user
 */
public class Personne {
    String Nom;
    String Prenom;
    int nbVoiture = 0;
    Voiture[] liste_Voitures;
    
    public Personne(String unNom, String unPrenom){
        Nom = unNom;
        Prenom = unPrenom;
        liste_Voitures = new Voiture[3];
    }
    
    public boolean nouvelle_voiture (Voiture voiture_en_plus){
        boolean x = true;
        if (nbVoiture == 3){
            x = false;
        }
        
        if (voiture_en_plus.proprietaire != null){
            x = false;
        }
        
        liste_Voitures[nbVoiture] = voiture_en_plus;
        nbVoiture++ ;
        voiture_en_plus.proprietaire = this;
        return x;
    }
}
