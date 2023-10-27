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

    public Partie() {
        Grille = new GrilleDejeu(5, 5); // Crée une grille de 5x5 cellules par défaut
        nbCoups = 0;
    }

    public void initialiserPartie() {
        Grille.melangerMatriceAleatoirement(10); // Mélange la grille pour garantir une solution réalisable
    }

    public void lancerPartie() {
        initialiserPartie();
        Scanner scanner = new Scanner(System.in);

        while (!Grille.cellulesToutesEteintes()) {
            System.out.println("Grille de jeu après " + nbCoups + " coups :");
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
                System.out.println("Coup invalide. Utilisez 'ligne [num]', 'colonne [num]', ou 'diagonale'.");
                continue;
            }

            nbCoups++;
        }

        System.out.println("Félicitations ! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");
    }

    public static void main(String[] args) {
        Partie partie = new Partie();
        System.out.println("Jeu LightOff - Éteignez toutes les cellules !");
        partie.lancerPartie();
    }
}
