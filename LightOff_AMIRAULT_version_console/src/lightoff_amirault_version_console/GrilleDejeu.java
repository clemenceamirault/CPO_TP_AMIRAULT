/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_amirault_version_console;

/**
 *
 * @author user
 */
public class GrilleDejeu {
    private CelluleLumineuse [][] matriceCellules ;
    private int nbLignes;
    private int nbColonne;
    
    public GrilleDejeu (int p_nbLignes, int p_nbColonne){
        nbLignes = p_nbLignes;
        nbColonne = p_nbColonne;
        
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonne];
        
    }
    
    
}
