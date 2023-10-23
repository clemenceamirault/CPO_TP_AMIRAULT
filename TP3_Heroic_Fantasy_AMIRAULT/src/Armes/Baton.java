/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author user
 */
public class Baton extends Arme {
    private int age;
    
    public Baton(String nom, int nivattaque, int age) {
        super(nom, nivattaque);
        this.age = age;
    }
    
    public int getage(){
    return age;
    }
    
    @Override
    public String toString(){
        return "Baton : "+ getnom()+ ", niveau d'attaque : "+ getnivattaque()+ ", Age : "+ getage();
    }

    private String getnivattaque() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
