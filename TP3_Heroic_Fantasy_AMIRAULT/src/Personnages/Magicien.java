/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author user
 */
public class Magicien extends Personnage {
    private boolean confirme;
    
    public Magicien(String nom, int nivdevie, boolean confirme) {
        super(nom, nivdevie);
        this.confirme = confirme;
    }
    
    public boolean isconf(){
        return confirme;
    }
    
    public void setconfirme(boolean confirme){
        this.confirme = confirme;
    }
    
}
