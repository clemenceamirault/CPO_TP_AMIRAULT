
import java.awt.Graphics;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class CelluleGraphique extends JButton {
    int largeur;
    int hauteur;
    CelluleLumineuse celluleLumineuseAssociee;
    
    public CelluleGraphique (CelluleLumineuse celluleLumineuseAssociee, int l, int h){
        this.largeur = l;
        this.hauteur = h;
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
    }
    
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        this.setText(celluleLumineuseAssociee.toString());
    }
}
