package src.infection.entity;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
// import java.util.function.Function;

import src.infection.game.AbstractGame;

public class Human extends AbstractPlayer implements GamePlayer {

	protected String name;
	private static int instances = 0;
	
	public Human(Scanner sc) {

		instances++;

		
		System.out.println("\nEnter player " + this.instances + " name :\n");
		
		this.name = sc.nextLine();
	}
	
	/*Méthode de GamePlayer*/
	@Override
	public int getMove(AbstractGame game) {
		return 0;
		// return getMove(game, game.showPossibleMove(), game::isValidMove);
	}
	
	// public int getMove(AbstractGame game, String out, Function<Integer, Boolean> isValidMove) {
	// 	int move = -1;

 //        while(!isValidMove.apply(move)) {
	// 		this.stopMove(game); //Voir AbstractPlayer
 //    	    // Clear screen
 //   	 	    System.out.println("\033[H\033[2J");
            
 //        	System.out.println(game.situationToString());
 //        	System.out.println("Au tour de " + this.getName() + " de jouer, en attente de son coup :\n");
 //            System.out.println(out);
 //            move = this.scan.nextInt();
 //            System.out.println();
 //        }

 //        return move;
	// }

	@Override
  	public String getName() {
	  
	  return this.name;
  	}

}
