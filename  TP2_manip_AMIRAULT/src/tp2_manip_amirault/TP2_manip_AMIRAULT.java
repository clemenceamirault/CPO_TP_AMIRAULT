/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_amirault;

/**
 *
 * @author user
 */
public class TP2_manip_AMIRAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Tartiflette assiette1 = new Tartiflette(500) ;
    Tartiflette assiette2 = new Tartiflette(600) ; 
    Tartiflette assiette3 = assiette2 ;
    
    assiette2.incrementeCalories(100);
    System.out.println("nb de calories de Assiette 2 : " + 
    assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 3 : " + 
    assiette3.nbCalories) ;
    
    // On échange les valeurs 
    Tartiflette inv = assiette1;
    assiette1 = assiette2;
    assiette2 = inv;
    
    // Les 2 lignes sont fausses
    // REPONSE : NON
    
    Moussaka[] MoussakaNew = new Moussaka[10];
    for (int i=0; i<MoussakaNew.length; i++ ){
        MoussakaNew[i] = new Moussaka();
    }
    System.out.println("Nombre d'objets Moussaka créés : " + MoussakaNew.length);
    }
    
}
