# BatailleNavale

package projetnaval;
import java.util.*;

/**
 *
 * @author rebecca
 */
public class Plateau {
    //attributs
    private int ligne;
    private int colonne;
    private int nbligne;
    private int nbcolonne;
    private int etat;
    private String [][] plateau;
    
    
    
    
    //constructeur
    public Plateau(int l, int c){
        
        ligne =l;
        colonne = c;
        plateau = new String [ligne][colonne];
        
        
        
          
        for (int i = 0; i<ligne; i++){
            
            for (int j = 0; j<colonne; j++){
                
                
                plateau[i][j] = " " ;

                
                }
            
            
        
            
        }
        }
    
    
    //methodes
    public void afficher(){
        System.out.println();
    
        
        for (int r = 0; r<ligne; r++){
            
            if (r%2==0){
            for (int j = 0 ; j<colonne; j++){
             
             int i=r/2;
             if (i==1 &  j==0){plateau[i][j] = "a";}
             if (i==2 &  j==0){plateau[i][j] = "b";}
             if (i==3 &  j==0){plateau[i][j] = "c";}
             if (i==4 &  j==0){plateau[i][j] = "d";}
             if (i==5 &  j==0){plateau[i][j] = "e";}
             if (i==6 &  j==0){plateau[i][j] = "f";}
             if (i==7 &  j==0){plateau[i][j] = "g";}
             if (i==8 &  j==0){plateau[i][j] = "h";}
             if (i==9 &  j==0){plateau[i][j] = "i";}
             if (i==10 &  j==0){plateau[i][j] ="j";}   
             if (i==11 &  j==0){plateau[i][j] = "k";}
             if (i==12 &  j==0){plateau[i][j] = "l";}
             if (i==13 &  j==0){plateau[i][j] = "m";}
             if (i==14 &  j==0){plateau[i][j] = "p";}
             if (i==15 &  j==0){plateau[i][j] = "o";}
            
                
             if (i==0 &  j==1){plateau[i][j] = "0";}   
             if (i==0 &  j==2){plateau[i][j] = "1";}
             if (i==0 &  j==3){plateau[i][j] = "2";}
             if (i==0 &  j==4){plateau[i][j] = "3";}
             if (i==0 &  j==5){plateau[i][j] = "4";}
             if (i==0 &  j==6){plateau[i][j] = "5";}
             if (i==0 &  j==7){plateau[i][j] = "6";}
             if (i==0 &  j==8){plateau[i][j] = "7";}
             if (i==0 &  j==9){plateau[i][j] = "8";}
             if (i==0 &  j==10){plateau[i][j] = "9";}
             if (i==0 &  j==11){plateau[i][j] = "10";}   
             if (i==0 &  j==12){plateau[i][j] = "11";}
             if (i==0 &  j==13){plateau[i][j] = "12";}
             if (i==0 &  j==14){plateau[i][j] = "13";}
             if (i==0 &  j==15){plateau[i][j] = "14";}
             
             
             if (i>0 & j>10)
                System.out.print(plateau[i][j]+ " | ");
             else if (j<=10)
                System.out.print(plateau[i][j]+ " | ");
             else
                System.out.print(plateau[i][j]+ "| ");
             
                
            }
             
            }else{
                System.out.print("--|");
                for (int t = 0; t<15; t++){
                    System.out.print("---|");
                }
             }
   
            System.out.println( );
            
        
    }
        System.out.println();
            
    }
    public void setLigne(int l){
        ligne=l;
    }
    public int getLigne( ){
        return ligne;
    }
    public void setColonne(int c){
        colonne=c;
    }
    public int getColonne(){
        return colonne;
    }
    
    public String getCase(){
        return plateau[ligne][colonne];
    }
   
    public void estOccupé(){}

   
     
   // public int getEtat(){
      //return;  
    //}
    public void setEtat(int l, int c){
        
   }
