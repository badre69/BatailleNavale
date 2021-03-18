
package bataillenavale;


public class Parametre {
    
    private int nbCaseX;
    private int nbCaseY;
    private boolean majPortee;
//    private Parametre _parametre;
    
    public Parametre() {
        
    } // Parametre()
    
    
    public Parametre(int nbCaseX, int nbCaseY, boolean majPortee) {
        
        this.nbCaseX = nbCaseX;
        this.nbCaseY = nbCaseY;
        this.majPortee = majPortee;

    } // Parametre(int nbCaseX, int nbCaseY, String difficulte, boolean majPortee, Epoque epoque)
    
    //getter et setter 
    
    public int getNbCaseX() {
        return nbCaseX;
    }

    public void setNbCaseX(int nbCaseX) {
        this.nbCaseX = nbCaseX;
    }

    public int getNbCaseY() {
        return nbCaseY;
    }

    public void setNbCaseY(int nbCaseY) {
        this.nbCaseY = nbCaseY;
    }

    public boolean isMajPortee() {
        return majPortee;
    }

    public void setMajPortee(boolean _majPortee) {
        this.majPortee = _majPortee;
    }
    
//    public Parametre getParametre() {
//       return _parametre;
//    }
    
}
