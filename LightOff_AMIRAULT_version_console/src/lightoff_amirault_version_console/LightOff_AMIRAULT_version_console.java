/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_amirault_version_console;

/**
 *
 * @author TDB MINI PROJET CONSOLE Clémence Amirault 25/10/2023
 */
public class LightOff_AMIRAULT_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CelluleLumineuse Cellule1 = new CelluleLumineuse ();
        System.out.println("Etat de la cellule1 : "+Cellule1);
        
        CelluleLumineuse Cellule2 = new CelluleLumineuse ();
        Cellule2.activerCellule();
        System.out.println("Etat de la cellule2 : "+ Cellule2);
        
        Cellule1.activerCellule();
        System.out.println("Etat de la cellule après activation : "+ Cellule1);
        
        Cellule2.eteindreCellule();
        System.out.println("Etat de la cellule après extinction : "+ Cellule2);
        
        boolean EstEteint1 = Cellule1.estEteint();
        System.out.println("La cellule 1 est éteinte : "+ EstEteint1);
        
        boolean EstEteint2 = Cellule2.estEteint();
        System.out.println("La cellule 2 est éteinte : "+ EstEteint2);
        
        
    }
    
}
