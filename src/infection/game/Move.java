package src.infection.game;

import java.util.List;

import src.infection.entity.GamePlayer;

/**
 * Classe Move
 */

public class Move {

	private int[] originalPos; 	// Position de départ du pion déplacé.
	private int[] nextPos; 	 	// Position finale du pion déplacé.

	private String typeOfMove;	// Type du déplacement.

	public Move(int[] origin, int[] next, String moveType) {
		this.originalPos = origin;
		this.nextPos = next;
		
		this.typeOfMove = moveType;
	}

	public int[] getOriginalPos() {
		return this.originalPos;
	}

	public int[] getNextPos() {
		return this.nextPos;
	}

	public String getMoveType() {
		return this.moveType;
	}


}