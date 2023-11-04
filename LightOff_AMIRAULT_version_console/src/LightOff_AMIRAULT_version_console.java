/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author TDB MINI PROJET CONSOLE Clémence Amirault 25/10/2023
 */
public class LightOff_AMIRAULT_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu LightOff !");
        System.out.println("Choisissez la difficulté :");
        System.out.println("1. Facile");
        System.out.println("2. Moyen");
        System.out.println("3. Difficile");
        System.out.print("Entrez le numéro de la difficulté : ");

        int choixDifficulte = scanner.nextInt();

        Difficulte difficulte;
        switch (choixDifficulte) {
            case 1:
                difficulte = Difficulte.FACILE;
                break;
            case 2:
                difficulte = Difficulte.MOYEN;
                break;
            case 3:
                difficulte = Difficulte.DIFFICILE;
                break;
            default:
                difficulte = Difficulte.MOYEN; // Par défaut, choisissez la difficulté moyenne
        }

        System.out.println("Choisissez la taille de la grille :");
        System.out.println("1. Petite");
        System.out.println("2. Moyenne");
        System.out.println("3. Grande");
        System.out.print("Entrez le numéro de la taille de la grille : ");

        int choixTailleGrille = scanner.nextInt();

        TailleGrille tailleGrille;
        switch (choixTailleGrille) {
            case 1:
                tailleGrille = TailleGrille.PETITE;
                break;
            case 2:
                tailleGrille = TailleGrille.MOYENNE;
                break;
            case 3:
                tailleGrille = TailleGrille.GRANDE;
                break;
            default:
                tailleGrille = TailleGrille.MOYENNE; // Par défaut, choisissez une grille moyenne
        }
     
        
           Partie partie = new Partie(int.class, Partie.Difficulte, Partie.TailleGrille); // Crée un objet Partie

        partie.initialiserPartie(); // Initialise la partie en mélangeant la grille
        partie.lancerPartie(); // Lance le jeu LightOff
    }
}
         
    
    

