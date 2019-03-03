package src.infection.entity;

import src.infection.game.AbstractGame;

public abstract class AbstractPlayer {
	
	private String name;

	public void stopMove(AbstractGame game) throws IllegalArgumentException {
		if (game.isGameOver()) {
			throw new IllegalArgumentException("C'est fini ! Le jeu est terminé !");
		}
	}

	/**
	 * @getter : String name;
	 */
	public String getName() {
		return "Computer#" + this.hashCode();
	};
}