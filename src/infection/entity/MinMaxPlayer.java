package games.entity;

import games.AbstractGame;
import java.util.List;

public class MinMaxPlayer extends AbstractPlayer implements GamePlayer{
	
	/*Méthode de GamePlayer*/
	@Override
	public int getMove(AbstractGame game){
		
		this.stopMove(game);

		int maximalValue  = -2;
		int bestMove =  0;
		
		List<Integer> validMoves = game.validMoves();
		
		for(int move : validMoves) {
			
			AbstractGame gameCopy = game.getCopy();
		
			gameCopy.playMove(move);
			
			int evaluation = -this.eval(gameCopy);
			
			if(evaluation > maximalValue){ 

				maximalValue = evaluation ;
				bestMove = move;
			}
		}
	
		return bestMove;
		
	}
	
	public int eval(AbstractGame game){
		
		if(game.isGameOver()){ 
	
			if(game.getWinner() == game.getCurrentPlayerName()) {
				return 1;
			} else if (game.getWinner() == null) {
				return 0;
			} else {
				return -1;
			}		
			
		} else {
				
			int result = -2;
			
			List<Integer> validMoves = game.validMoves();
		
			for(int move : validMoves){
				
				AbstractGame gameCopy = game.getCopy();
				
				gameCopy.playMove(move);
				
				int evaluation = -this.eval(gameCopy);
				
				if(result < evaluation){
					
					result = evaluation;
				}
				
			}
		
			return result ;

		}
		
	}

}
			
			
			
		
		
			