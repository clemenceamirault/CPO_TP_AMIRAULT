/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_amirault;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author TDB TP3 AMIRAULT Clémence 23/10/2023
 */
public class TP3_Heroic_Fantasy_AMIRAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Arme> armeList = new ArrayList();
        
        Epee Excalibur = new Epee("Excalibur", 7, 5);
        Epee Durandal = new Epee("Durandal", 4,7);
        
        Baton Chene = new Baton("Chene",4,5);
        Baton Charme = new Baton("Charme",5,6);
        
        Arme[] tabArme =new Arme [4];
        
        armeList.add(Excalibur);
        armeList.add(Durandal);
        armeList.add(Chene);
        armeList.add(Charme);
        
        for (int i=0; i<armeList.size(); i++){
        Arme arme =armeList.get(i);
        System.out.println(arme);
        }
    }
    
}
