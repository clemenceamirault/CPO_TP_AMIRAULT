/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Personnage implements etreVivant{
    private String nom;
    private int nivdevie;
    private ArrayList<Arme> inventaire;
    private Arme Arme_en_main;
    private Object armes;
    private static int nombreTotalDePersonnages = 0;
    static int nombreTotalDeGuerriers = 0;
    static int nombreTotalDeMagiciens = 0;
    
    public Personnage (String nom, int nivdevie){
    this.nom = nom;
    this.nivdevie = nivdevie;
    inventaire = new ArrayList<>();
    Arme_en_main = null;
    nombreTotalDePersonnages++;
    }
    
    @Override
    public void seFatiguer(){
        nivdevie -=10;
    }
    
    @Override
    public boolean estVivant(){
        return nivdevie >0 ;
    }
    
    @Override
    public void estAttaque(int points){
        nivdevie -= points;
    }
    
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        nombreTotalDePersonnages--;
        if (this instanceof Guerrier) {
            nombreTotalDeGuerriers--;
        } else if (this instanceof Magicien) {
            nombreTotalDeMagiciens--;
        }
    }
    
    public void ajoutArmes (Arme armes){
        if (inventaire.size()<5){
            inventaire.add(armes);
        }else{
            System.out.println("impossible d'ajouter une arme, l'inventaire est plein");
        }
    }
    
        public void equiperarme (String nomArme){
        for (Arme armes : inventaire){
        if (armes.getnom().equals(nomArme)){
            Arme_en_main = armes;
            System.out.println(nom+ "est maintenant équipé de "+ nomArme);
            return;
        }
        }
        System.out.println("Armes introuvable dans l'inventaire sorry");
    }
        
        public Arme getArmemain(){
            return Arme_en_main;
        }
    
    
    public int getnivdevie(){
        return nivdevie;
    }
    
    @Override
    public String toString (){
        return "Personnage : "+ nom + ", niveau de vide : "+ nivdevie;
    }
    
    public String getnom(){
        return nom;
    }
    
     public static int getNombreTotalDePersonnages() {
        return nombreTotalDePersonnages;
    }

    public static int getNombreTotalDeGuerriers() {
        return nombreTotalDeGuerriers;
    }

    public static int getNombreTotalDeMagiciens() {
        return nombreTotalDeMagiciens;
    }

    
}

    

        
    
    


