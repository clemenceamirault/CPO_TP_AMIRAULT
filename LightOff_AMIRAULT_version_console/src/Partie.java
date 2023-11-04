/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author user
 */
public class Partie {
     private GrilleDejeu Grille;
    private int nbCoups;
    private int nbCoupsMax;
    
    public enum Difficulte {
        FACILE,MOYEN,DIFFICILE
    }
    
    public enum TailleGrille {
        PETITE,MOYENNE,GRANDE
    }

    public Partie(int nbCoupsMax, Difficulte difficulte, TailleGrille tailleGrille) {
        Grille = new GrilleDejeu(5, 5); // Crée une grille de 5x5 cellules par défaut
        nbCoups = 0;
        this.nbCoupsMax = nbCoupsMax;
        int nbLignes, nbColonnes;
        
        switch (tailleGrille) {
            case PETITE:
                nbLignes = 5;
                nbColonnes = 5;
                break;
            
            case MOYENNE:
                nbLignes = 8;
                nbColonnes = 8;
                break;
                
            case GRANDE:
                nbLignes = 10;
                nbColonnes = 10;
                break;
                
            default:
                nbLignes = 5;
                nbColonnes = 5;
                break;
        }
        
        Grille = new GrilleDejeu(nbLignes, nbColonnes);
        
        switch (difficulte){
            case FACILE:
                nbCoupsMax = 25;
                break;
                
            case MOYEN:
                nbCoupsMax = 15;
                break;
                
            case DIFFICILE:
                nbCoupsMax = 5;
                break;
                
            default :
                nbCoupsMax = 15;
                break;
        }
        nbCoups = 0;
    }

    public void initialiserPartie() {
        Grille.melangerMatriceAleatoirement(10); // Mélange la grille pour garantir une solution réalisable
    }

    public void lancerPartie() {
        initialiserPartie();
        Scanner scanner = new Scanner(System.in);

        while (!Grille.cellulesToutesEteintes()&& nbCoups< nbCoupsMax) {
            System.out.println("Grille de jeu apres " + nbCoups + " coups :");
            System.out.println(Grille);
            System.out.print("Entrez un coup (ligne, colonne, ou diagonale) : ");

            // Lecture de l'entrée du joueur
            String coup = scanner.nextLine();

            // Gestion des différents types de coups (ligne, colonne, ou diagonale)
            if (coup.startsWith("ligne")) {
                int idLigne = Integer.parseInt(coup.split(" ")[1]);
                Grille.activerLigneDeCellules(idLigne);
            } else if (coup.startsWith("colonne")) {
                int idColonne = Integer.parseInt(coup.split(" ")[1]);
                Grille.activerColonneDeCellules(idColonne);
            } else if (coup.equals("diagonale")) {
                Grille.activerDiagonaleDescendante();
            } else {
                System.out.println("Coup invalide. Utilisez 'ligne', 'colonne', ou 'diagonale'.");
                continue;
            }

            nbCoups++;
        }
         
          if (nbCoups < nbCoupsMax) {
            System.out.println("Félicitations ! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");
        } else {
            System.out.println("Vous avez atteint le nombre maximum de coups. Vous avez perdu !");
        }
        
    }

    public static void main(String[] args) {
        Partie partie = new Partie(50, Difficulte.FACILE, TailleGrille.PETITE );
        System.out.println("Jeu LightOff - Éteignez toutes les cellules !");
        partie.lancerPartie();
    }
}
