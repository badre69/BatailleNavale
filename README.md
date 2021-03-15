# BatailleNavale

package projetnaval;

import java.util.*;
import projetnaval.*;
/**
 *
 * @author rebecca
 */

public class Menu {

   
    public Menu() 
    
    {
        Scanner in = new Scanner(System.in);
        int choix=0;
        do{
        System.out.println("1) Jouer une partie\n2) Charger une partie\n3) Aide\n4) Quitter");
	System.out.print("Choix: ");
        choix = in.nextInt();
 
        
	switch (choix) 
	
	{
	    case 1:
	    System.out.println ( "Vous avez choisi l'option 1" );
	    System.out.println ("Bonne partie.");
            Partie play = new Partie();
            play.Partie();
	    break;
  
	    case 2:
	    System.out.println ( "Vous avez choisi l'option 2" );
	    System.out.println ("Rebonjour.");
            //Sauvegarde sauve = new Sauvegarde();
            //sauve.Sauvegarde();
	    break;
  
	    case 3:
	    System.out.println ( "Vous avez choisi l'option 3" );
	    System.out.println ("Aide.");
            Aide a = new Aide();
            a.Aide();
	    break;
            
            case 4:
	    System.out.println ( "Vous avez choisi l'option 4" );
	    System.out.println ("Au revoir.");
	    break;

	    default:
	    System.out.println ( "choix non reconnu" );
            System.out.println("Veuillez respecter le menu!");
	}
	
        }while(choix > 4);
    }
    }
