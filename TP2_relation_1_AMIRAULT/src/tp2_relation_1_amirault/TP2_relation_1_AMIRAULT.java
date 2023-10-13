/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_amirault;

/**
 *
 * @author AMIRAULT Clémence TDB TP2 13/10/2023
 */
public class TP2_relation_1_AMIRAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles "+ uneClio + 
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_Voitures[0] = uneClio ;
        bob.liste_Voitures[1] = uneMicra;
        bob.nbVoiture = 2 ;
        uneClio.proprietaire = bob ;
        uneMicra.proprietaire = bob; 
        
        System.out.println("la premiere voiture de Bob est " + 
        bob.liste_Voitures[0] ) ;
        System.out.println("la deuxieme voiture de Bob est" + bob.liste_Voitures[1]);

        reno.liste_Voitures[0] = une2008;
        reno.liste_Voitures [1] = uneAutreClio;
        reno.nbVoiture = 2;
        une2008.proprietaire = reno;
        uneAutreClio.proprietaire = reno;
        
        System.out.println("la premiere voiture de Reno est " + 
        reno.liste_Voitures[0] ) ;
        System.out.println("la deuxieme voiture de Reno est" + reno.liste_Voitures[1]);
    }
    
}
