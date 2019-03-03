package src.infection;

import src.infection.game.*;
import src.infection.entity.*;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		GamePlayer[] playerslist = { new Human(sc), new Human(sc)};

		AbstractGame infectionGame = new Infection(playerslist, 5);

		sc.close();
	}
}