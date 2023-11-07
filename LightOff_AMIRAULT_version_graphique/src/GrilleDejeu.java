/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;

/**
 *
 * @author user
 */
public class GrilleDejeu {
    CelluleLumineuse [][] matriceCellules ;
    private int nbLignes;
    private int nbColonne;
    
    public GrilleDejeu (int nbLignes, int nbColonne){
        nbLignes = Math.max(2, nbLignes);
        nbColonne = Math.max(2, nbColonne);
        
        
        
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonne];
        for (int i=0; i< nbLignes; i++){
            for (int j=0; j< nbColonne; j++){
            matriceCellules[i][j]= new CelluleLumineuse ();
        }
        }
    }
    
    public void EteindreToutesLesCellules (){
        for (int i =0; i<nbLignes ; i++){
            for (int j=0; j<nbColonne; j++){
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
     public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonne; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }
     
     public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }
     
     public void activerDiagonaleDescendante(){
         for (int i = 0; i < Math.min(nbLignes,nbColonne); i++){
               matriceCellules[i][i].activerCellule();  
         }
     }
    
     public void activerDiagonaleMontante(){
         for (int i =0; i<Math.min(nbLignes, nbColonne);i++){
             matriceCellules[i][nbColonne-1-i].activerCellule();
         }
     }
     
    public void activerLigneColonneOuDiagonaleAleatoire(){
        Random random =new Random();
        int choix = random.nextInt(3);
        
        if (choix<=0){
            int ligne = random.nextInt(nbLignes);
            activerLigneDeCellules(ligne);
        }else if (choix <= 1){
            int colonne = random.nextInt(nbColonne);
            activerColonneDeCellules(colonne);
        }else{
            if (random.nextBoolean()){
                activerDiagonaleDescendante();
            }else{
                activerDiagonaleMontante();
            }
        }
    }
        
    /**
     *
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours){
            EteindreToutesLesCellules();
            Random random = new Random();
            
            for (int tour = 0;tour<nbTours; tour++ ){
                activerLigneColonneOuDiagonaleAleatoire();
            }
        }
    
    public boolean cellulesToutesEteintes(){
        for (int i = 0;i< nbLignes; i++){
        for (int j=0;j < nbColonne; j++ ){
            if (!matriceCellules[i][j].estEteint()){
                return false;
            }
        }
    }
        return true;
    }
    
    @Override
public String toString(){
    StringBuilder gridString = new StringBuilder();
    for (int i =0; i<nbLignes; i++){
        for (int j=0; j<nbColonne; j++){
            gridString.append(matriceCellules[i][j]);
        }
        gridString.append("\n");
    }
    return gridString.toString();
}    
        
    }



  
            
    
    

