# BatailleNavale

package projetnaval;

import java.util.*;
import projetnaval.*;
/**
 *
 * @author rebecca
 */
public class Menu {

    public void montrer_menu() 
    {
	System.out.println("1) Jouer une partie\n2) Charger une partie\n3) Aide\n4) Quitter");
	System.out.print("Choix: ");
    }
    
   
 
    public Menu() 
    {
        Scanner in = new Scanner(System.in);
        montrer_menu();
  
	switch (in.nextInt()) 
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
	    System.err.println ( "choix non reconnu" );
	    break;
	}
    }
    
    
    
        
        
    
    }
