
package bataillenavale;

import java.util.Iterator;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Badredine
 */

public class PositionNavire {
    
       protected Partie partie;
       protected ArrayList<Case> cases;  // case d'apres le plateau 
/**
     * Permet de savoir si on peut placer le bateau a l'endroit desire
     * @param longueur taille du bateau a placer
     * @param sens sens dans lequel on souhaite placer le bateau
     * 1 - horizontal
     * 2 - vertical
     * 3 - diagonale
     * @param x position en abscisse a tester
     * @param y position en ordonnee a tester
     * @return TRUE si le bateau peut etre placer, FALSE sinon
     */    
       
    public boolean testPositionNavire(int longueur, int sens, int x, int y) {
        
        int pos = 0;
        for(int i=0;i<longueur;i++) {
            
            switch(sens) {

                case 1:
                    // Horizontale
                    pos = x+i+y*this.partie.getParametre().getNbCaseX();
                    if(this.cases.pos.getBateau() != null) {

                        return false;

                    }
                    break;

                case 2:
                    // Verticale
                    pos = x+(y+i)*this.partie.getParametre().getNbCaseX();
                    if(this.cases.pos.getBateau() != null) {

                        return false;

                    }
                    break;

                case 3:
                    // Diagonale
                    break;

                default:
                    break;

            }
            
        }
        
        return true;
        
    } 
     

    
    
    public void positionAleatoire(){
        
        Iterator iterator = this.partie.getParametre(); //Iterator permet de recouvrir la collection, ici de parametre 
        Random rand = new Random();
        int sens = rand.nextInt(2)+1;
        Navire navire = new Navire((Navire) this.partie.getParametre().get(iterator.next()));
        navire.setNbCasesNonTouchees(navire.getLongueur());
        int xDepart = rand.nextInt(this.partie.getParametre().getNbCaseX()-1-navire.getLongueur());
        int yDepart = rand.nextInt(this.partie.getParametre().getNbCaseY()-1-navire.getLongueur());
        
        while(iterator.hasNext()){  //hasnext retourne vrai si l'iterateur contient encore des éléments
            
        switch (sens) {
                
                case 1:
                    // Place le bateau horizontalement
                    while(!this.testPositionNavire(navire.getLongueur(), sens, xDepart, yDepart)) {
                        // On cherche des cases libres pour le bateau
                        xDepart = rand.nextInt(this.partie.getParametre().getNbCaseX()-1-navire.getLongueur());
                        yDepart = rand.nextInt(this.partie.getParametre().getNbCaseY()-1-navire.getLongueur());
                    }
                    for(int i=0;i<navire.getLongueur();i++) {
                        // On place le navire
                        navire.setOrientation(1);
                        //CaseBateau caseBateau = new CaseBateau(navire,this.partie); //cree une Methode Case bateau 
                        // caseBateau.setImage((String) navire.getImagesBateau().get(i+1));
                        //this.cases.set(xDepart+i+yDepart*this.partie.getParametre().getNbCaseX(), caseBateau);
                    }
                    break;
                    
                case 2:
                    // Place le bateau verticalement
                    while(!this.testPositionNavire(navire.getLongueur(), sens, xDepart, yDepart)) {
                        // On cherche des cases libres pour le bateau
                        xDepart = rand.nextInt(this.partie.getParametre().getNbCaseX()-1-navire.getLongueur());
                        yDepart = rand.nextInt(this.partie.getParametre().getNbCaseY()-1-navire.getLongueur());
                    }
                    for(int i=0;i<navire.getLongueur();i++) {
                        // On place le bateau 
                        navire.setOrientation(2);
                        //CaseBateau caseBateau = new CaseBateau(bateau,this.partie);
                        //caseBateau.setImage((String) navire.getImagesBateau().get(i+1));
                        //this.cases.set(xDepart+(yDepart+i)*this.partie.getParametre().getNbCaseX(), caseBateau);
                    }
                    break;
                    
                case 3:
                    // Place le bateau a la diagonale (bas gauche -> haut droit)
                    navire.setOrientation(3);
                    break;
                
                default:
                    break;
                
            }
            
        }
    }
    
 // methode case bateau
/**    
    public CaseBateau(Bateau bateau, Partie partie) {
        super(partie);
        
        this._bateau = bateau;
        //ImageIcon bateauImage = new ImageIcon(getClass().getResource("/stockage/images/Fond_gris.png"));
        if(this._image != null) {
            ImageIcon bateauImage = new ImageIcon(this._image);
            this.setIcon(bateauImage);
        }
        
    } 
    
    */
}
