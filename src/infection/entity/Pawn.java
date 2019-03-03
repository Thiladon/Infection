package src.infection.entity;

import java.util.List;

import src.infection.entity.GamePlayer;

/**
 * Classe Move
 */

public class Pawn {

	protected int x;	// Position de départ du pion déplacé.
	protected int y;	// Position finale du pion déplacé.

	protected GamePlayer owner;	// Type du déplacement.

	public Move(int x, int y, GamePlayer player) {
		this.x = x;
		this.y = y;
		
		this.owner = player;
	}

	public void setOwner(GamePlayer player) {
		this.owner = player;
	}

	public GamePlayer getOwner() {
		return this.owner;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
}