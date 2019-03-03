package src.infection.game;

import java.util.List;

import src.infection.entity.GamePlayer;
import src.infection.game.Move;

/**
 * Classe abstraite des jeux Nim et TicTacToe
 */

public abstract class AbstractGame {
	
	/* Joueur actuel */
	protected int currentPlayer;

	/* Liste des joueurs */
	protected GamePlayer[] players;

	/**
	 * @constructor : Instance de la class AbstractGame
	 * @param : players Listes des joueurs
	 */
	public AbstractGame(GamePlayer[] players) {
		this.players = players;
		this.currentPlayer = 0;
	}

	/**
	 * Méthode abstraite de la liste des coups.
	 * @return : La liste des coups valides.
	 */
	public abstract List<Move> validMoves();

	/**
	 * Méthode abstraite retournant une copie du jeu.
	 * @return : Une copie de l'instance courante du jeu.
	 */
	public abstract AbstractGame getCopy();
	
	/**
	 * Méthode abstraite retournant si le coup est valide.
	 * @return : True ou False si le coup est valide.
	 */
	public abstract boolean isValidMove(Move move);
	/**
	 * Méthode abstraite retournant si le jeu est fini.
	 * @return : True ou False si le jeu est terminé.
	 */
	public abstract boolean isGameOver();

	/**
	 * Méthode abstraite convertissant le choix du mouvement en chaines de caractères.
	 * @return : Chaines de caractères du mouvement choisi.
	 */
	public abstract String moveToString(int move);
	/**
	 * Méthode abstraite convertissant la situation du jeu en chaines de caractères.
	 * @return : Chaines de caractères de la situation.
	 */
	public abstract String situationToString();
	/**
	 * Méthode abstraite de la liste des coups valides en String.
	 * @return : La liste des coups valides sous formats de chaines de caractères.
	 */
	public abstract String showPossibleMove();
	/**
	 * Méthode abstraite retournant le gagnant de la partie en cours.
	 * @return : Le gagnant en chaines de caractères.
	 */
	public abstract String getWinner();	
	
	/**
	 * Méthode abstraite permettant de jouer un coup.
	 * @param move : Le coup du joueur courant.
	 */
	public abstract void playMove(Move move);

	public GamePlayer getCurrentPlayer() {
		return this.players[this.currentPlayer];
	}

	public String getCurrentPlayerName() {
		return this.players[this.currentPlayer].getName();
	}

	public void playMovePlayer(Move move) {
		this.playMove(move);
		this.changeCurrentPlayer();
	}

	public void changeCurrentPlayer() {
		this.currentPlayer = ++this.currentPlayer > this.players.length - 1 ? 0 : 1;
	}

	public void start() {

	}

}