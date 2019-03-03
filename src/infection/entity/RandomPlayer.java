package games.entity;

import games.AbstractGame;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class permettant de faire jouer un joueur automatique tirant ses coups au hasard
 */
public class RandomPlayer extends AbstractPlayer implements GamePlayer {
	
	/**
	 * Attribut permettant d'utiliser l'aléatoire dans les méthodes de RandomPlayer
	 */
	protected Random randomGenerator;
	
	/**
	 * Construit une nouvelle instance de la class RandomPlayer
	 */
	public RandomPlayer() {
		
		this.randomGenerator = new Random();
	}
	
	@Override
	public int getMove(AbstractGame game) {
		
		this.stopMove(game);
		
		List<Integer> possibleMove = game.validMoves();
		
		return possibleMove.get(this.randomGenerator.nextInt(possibleMove.size()));
		
	}

}
