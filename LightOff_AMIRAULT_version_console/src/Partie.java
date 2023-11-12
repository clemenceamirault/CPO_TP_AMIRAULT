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

    public Partie(int nbCoupsMax, Difficulte difficulte, TailleGrille tailleGrille) {
        Grille = new GrilleDejeu(5, 5);
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

        switch (difficulte) {
            case FACILE:
                nbCoupsMax = 25;
                break;

            case MOYEN:
                nbCoupsMax = 15;
                break;

            case DIFFICILE:
                nbCoupsMax = 5;
                break;

            default:
                nbCoupsMax = 15;
                break;
        }
        nbCoups = 0;

        if (Grille.cellulesToutesEteintes()) {

        }

    }

    public void appliquerAction(TypeAction typeAction) {
        switch (typeAction) {
            case LIGNE:
                Grille.activerLigneDeCellules(0); // Remplacez l'indice de ligne approprié
                break;
            case COLONNE:
                Grille.activerColonneDeCellules(0);
                break;
            case DIAGONALE:
                Grille.activerDiagonaleDescendante();
                break;
        }

        if (Grille.cellulesToutesEteintes()) {
            System.out.println("Bravo ! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");

        }

        // Incrémenter le nombre de coups
        nbCoups++;

        // Vérifier si le nombre de coups atteint un seuil
        if (nbCoups >= nbCoupsMax) {
            System.out.println("Vous avez atteint le nombre maximum de coups. Vous avez perdu !");
            // Désactiver les boutons actionnables ou afficher un message de défaite
        }
    }

    public void actionLigne() {
        appliquerAction(TypeAction.LIGNE);
    }

    public void actionColonne() {
        appliquerAction(TypeAction.COLONNE);
    }

    public void actionDiagonale() {
        appliquerAction(TypeAction.DIAGONALE);
    }

    public enum TypeAction {
        LIGNE,
        COLONNE,
        DIAGONALE
    }

    public void initialiserPartie() {
        Grille.melangerMatriceAleatoirement(10);
    }

    public void lancerPartie() {
        initialiserPartie();
        Scanner scanner = new Scanner(System.in);

        while (!Grille.cellulesToutesEteintes() && nbCoups < nbCoupsMax) {
            System.out.println("Grille de jeu apres " + nbCoups + " coups :");
            System.out.println(Grille);
            System.out.print("Entrez un coup (ligne, colonne, ou diagonale) : ");

            // Lecture de l'entrée du joueur
            String coup = scanner.nextLine();

            // Gestion des différents types de coups (ligne, colonne, ou diagonale)
            if (coup.startsWith("ligne")) {
                String[] parts = coup.split(" ");
                if (parts.length >= 2) {
                    int idLigne = Integer.parseInt(parts[1]);
                    Grille.activerLigneDeCellules(idLigne);
                } else {
                    System.out.println("Coup invalide. Utilisez 'ligne', 'colonne', ou 'diagonale'.");
                }
            } else if (coup.startsWith("colonne")) {
                String[] parts = coup.split(" ");
                if (parts.length >= 2) {
                    int idColonne = Integer.parseInt(parts[1]);
                    Grille.activerColonneDeCellules(idColonne);
                } else {
                    System.out.println("Coup invalide. Utilisez 'ligne', 'colonne', ou 'diagonale'.");
                }
            } else if (coup.equals("diagonale")) {
                Grille.activerDiagonaleDescendante();
            } else {
                System.out.println("Coup invalide. Utilisez 'ligne', 'colonne', ou 'diagonale'.");
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
        Partie partie = new Partie(50, Difficulte.FACILE, TailleGrille.PETITE);
        System.out.println("Jeu LightOff - Éteignez toutes les cellules !");
        partie.lancerPartie();
    }

}
