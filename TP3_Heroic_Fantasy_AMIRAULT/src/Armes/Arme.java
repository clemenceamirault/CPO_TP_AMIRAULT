/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author user
 */
public class Arme {
    private String nom;
    private int nivattaque;
    
    public Arme(String nom, int nivattaque){
        this.nom=nom;
        this.nivattaque = nivattaque;
    }
    
    public int getnivatt() {
    return nivattaque;
}
    public String toString() {
        return "Arme : "+ nom + ", Niveau d'attaque : "+ nivattaque;
    }
    public String getnom(){
        return nom;
    }
}
