/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author user
 */
public class Guerrier extends Personnage {
    private boolean cheval;
    
    public Guerrier(String nom, int nivdevie, boolean cheval) {
        super(nom, nivdevie);
        this.cheval = cheval;
    }
    
    public boolean ischeval(){
    return cheval;
}
    public void satcheval (boolean cheval){
        this.cheval = cheval;
    }
    
}
