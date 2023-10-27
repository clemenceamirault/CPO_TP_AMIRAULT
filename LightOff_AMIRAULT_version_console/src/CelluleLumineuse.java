/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author user
 */
class CelluleLumineuse {
        private boolean etat;
    
    
public CelluleLumineuse(){
    etat= false;
}    

public void activerCellule(){
    etat = !etat;
}

public void eteindreCellule(){
    etat = false;
}

public boolean estEteint(){
    return etat == false;
}

public boolean getEtat(){
    return etat;
}

    /**
     *etat de la cellule allumée X eteint O
     * @return
     */
    @Override
    public String toString(){
    return etat? "X" : "O";
    }
}    
