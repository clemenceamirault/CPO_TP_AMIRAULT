/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_amirault;

/**
 *
 * @author user
 */
public class Epee extends Arme {
    private int indicefiness;
    
    public Epee(String nom, int nivattaque, int indicefiness) {
        super(nom, nivattaque);
        this.indicefiness = indicefiness;
    }
    
    public int getindicefiness() {
       return indicefiness; 
    }
    
    public String toString(){
        return "Epee : "+ getnom() + ", niveau d'attaque " + getnivattaque() + ", indice finess : "+ indicefiness;
    }

    private String getnivattaque() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
