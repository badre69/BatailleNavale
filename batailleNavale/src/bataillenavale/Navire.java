
package bataillenavale;

import java.util.Random;

public class Navire {

    //Variable 
    
    private String nom; // cuirassé,  croiseurs,  destroyers, sous-marins
    private int longueur; //respectivement 7, 5, 3, 1
    private int portee; //respectivement 9, 4, 1, 1
    private int nbCasesNonTouchees; //nombre de case du bateau touché 
    private int orientation; //verticale ou horizontale 
    
    public Navire(){
    }
    
        public Navire(Navire navire) {
        
        this.longueur = navire.getLongueur();
        this.nbCasesNonTouchees = navire.getNbCasesNonTouchees();
        this.nom = navire.getNom();
        this.portee = navire.getPortee();
        this.orientation = navire.getOrientation();

    }
//public class PositionNavire();
    
//test pour savoir si le bateau est coulé 
        
    public boolean testBateauCoule() {
        
        return (this.nbCasesNonTouchees <= 0);    
        
    }    
    
    // getter et setter 
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getPortee() {
        return portee;
    }

    public void setPortee(int portee) {
        this.portee = portee;
    }

    public int getNbCasesNonTouchees() {
        return nbCasesNonTouchees;
    }

    public void setNbCasesNonTouchees(int nbCasesNonTouchees) {
        this.nbCasesNonTouchees = nbCasesNonTouchees;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }  
    
}

