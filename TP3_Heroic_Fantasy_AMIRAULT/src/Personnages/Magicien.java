/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;

/**
 *
 * @author user
 */
public class Magicien extends Personnage {
    private boolean confirme;
    
    public Magicien(String nom, int nivdevie, boolean confirme) {
        super(nom, nivdevie);
        this.confirme = confirme;
        nombreTotalDeMagiciens++;
    }
    
    public boolean isconf(){
        return confirme;
    }
    
    public void setconfirme(boolean confirme){
        this.confirme = confirme;
    }

    public Iterable<Arme> getInventaire() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void attaquer (Personnage cible){
        cible.estAttaque(20);
    }
    
}
