/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_amirault;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;
import Armes.*;
import Personnages.*;

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
    
    
      ArrayList<Personnage> PersonnageList = new ArrayList ();
      
      Magicien Gandalf = new Magicien ("Gandalf", 65, true);
      Magicien Garcimore = new Magicien ("Garcimore", 44, false);
      
      Guerrier Conan = new Guerrier ("Conan", 78, false);
      Guerrier Lannister = new Guerrier ("Lannister", 45, true);
      
      
      PersonnageList.add(Gandalf);
      PersonnageList.add(Garcimore);
      PersonnageList.add(Conan);
      PersonnageList.add(Lannister);
      
      for (Personnage personnage : persoList){
            System.out.println(personnage);

} 
      Guerrier guerrier = new Guerrier ("clem", 79, false);
      Magicien magicien = new Magicien ("Lulu", 68, true);
      
      Baton b1 = new Baton("Chene",4,5);
      Eppe E1 = new Epee("Excalibur",7,5);

}
      

    
      
    

