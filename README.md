# BatailleNavale

package projetnaval;

/**
 *
 * @author rebecca
 */
public class Aide {
    public void Aide(){
        System.out.println ( "Règles : Au début du jeu, chaque joueur place à sa guise tous les bateaux sur sa grille de façon stratégique.\n "
                                     +"Le but étant de compliquer au maximum la tache de son adversaire, c’est-à-dire détruire tous vos navires. \n"
                                     +"Bien entendu, le joueur ne voit pas la grille de son adversaire.\n" 
                                     +"Une fois tous les bateaux en jeu, la partie peut commencer.. Un à un, les joueurs se tire dessus pour détruire les navires ennemis.\n"
                                     +"Pour attaquer l'adversaire, le joueur doit citer les coordonnées de l'emplacement qu'il veulent attaqué. \n" 
                                     +"Si un joueur tire sur un navire ennemi, l’adversaire doit le signaler en disant « touché ». \n"
                                     +"Il ne peut pas jouer deux fois de suite et doit attendre le tour de l’autre joueur.\n"
                                     +"Si le joueur ne touche pas de navire, l’adversaire le signale en disant « raté » .\n" 
                                     +"Si le navire est entièrement touché l’adversaire doit dire « touché coulé ».\n" 
                                     +"Chaque joueur possède une flotte de 10 navires : 1 cuirassé, 2 croiseurs, 3 destroyers et 4 sous-marins.\n"
                                     +"Chaque joueur possède un cuirassé (7 cases) avec une puissance de tir de 9 cases, un croiseur (5 cases) avec une puissance de tir de 4 cases, un destroyeur (3 cases) avec une puissance de tir d'une case et un sous marin (1 case) avec une puissance de tir d'une case.\n"
                                      );
        new Menu();
}
}
