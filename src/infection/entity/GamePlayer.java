package src.infection.entity;

import java.util.function.Function;
import java.util.Scanner;

import src.infection.game.AbstractGame;

public interface GamePlayer {
	public String getName();
	public abstract int getMove(AbstractGame game);

}
