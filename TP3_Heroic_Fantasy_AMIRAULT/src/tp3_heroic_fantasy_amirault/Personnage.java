/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_amirault;

/**
 *
 * @author user
 */
public class Personnage {
    private String nom;
    private int nivdevie;
    
    public Personnage (String nom, int nivdevie){
    this.nom = nom;
    this.nivdevie = nivdevie;
    }
    
    public int getnivdevie(){
        return nivdevie;
    }
    
    @Override
    public String toString (){
        return "Personnage : "+ nom + ", niveau de vide : "+ nivdevie;
    }
    
    public String getnom(){
        return nom;
    }
}
