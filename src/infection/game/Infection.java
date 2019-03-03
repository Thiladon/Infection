package src.infection.game;

import java.util.List;
import java.util.ArrayList;

import src.infection.game.AbstractGame;
import src.infection.entity.GamePlayer;

public class Infection extends AbstractGame {
	
	protected int size;
	protected GamePlayer[][] grid;

	public Infection(GamePlayer[] playerslist, int size) {

		super(playerslist);

		this.initializeGrid(size);
		
	}

	public List<Move> validMoves() {
		List<Move> _tmpList = new ArrayList<>();
		
		HERE
		
		return _tmpList;
	}

	/*
		Terminé, just need to refactor.
	*/
	public Infection getCopy(){

		Infection copy = new Infection(this.players, this.grid.length);

		copy.currentPlayer = this.currentPlayer;

		copy.grid = this.grid;

		return copy;
		
	}

	public boolean isValidMove(Move move) {
		return false;
	}

	public boolean isGameOver() {
		return false;
	}

	public String moveToString(int move) {
		return "Move to String";
	}

	public String situationToString() {

		return "situationToString";
	}
	public String showPossibleMove() {

		return "Listes des coups valides";
	}

	public String getWinner() {
		
		return "Winner";
	}

	/**
	 * Joue un coup donné.
	 * @param i [description]
	 */
	public void playMove(Move i) {
		
	}


	/* ---------  Function non hérité de AbstractGame  --------- */


	public void initializeGrid(int n) {
		this.grid = new GamePlayer[n][n];

		// Placé les pions en haut à gauche et en bas à droite.
	}


	/**
	 * Retourne l'index de la position horizontale dans la grille, du pion.
	 * @param i index de la case.
	 */
	int getRow(int i) {
		return (i / this.grid.length) % this.grid.length;
	}

	/**
	 * Retourne l'index de la position verticale dans la grille, du pion.
	 * @param j index de la case.
	 */
	int getCol(int j) {
		return j % this.grid.length;
	}

	/**
	 * Retourne le pion correspondant à l'index de la case, dans la grille.
	 * @param i index de la case.
	 */	
	GamePlayer getCell(int i) {
		return this.grid[this.getRow(i)][this.getCol(i)];
	}

}