package src.test.gridtest;

import java.util.Scanner;

public class Grid {
	
	protected int size;
	protected int[][] grid;

	public Grid(int size) {
		this.size = size;
		this.grid = initialize();
	}

	public int[][] initialize() {
		return new int[this.size][this.size];
	}

	public void forceGrid(int[][] grid) {
		this.grid = grid;
		this.size = grid.length;
	}

	// public int getCell()

	public String toString() {


		String _temp = "\n " + new String(new char[String.valueOf(this.size).length()]).replace("\0", " ") + "|";
		
		for (int i = 0; i < this.size ; i++ ) {
			_temp += " " + (char)(65 + i);
		}

		_temp += "\n" + new String(new char[String.valueOf(this.size).length()]).replace("\0", "-") + new String(new char[this.size + 2]).replace("\0", "--") + "\n";

		for (int i = 0; i < this.size ; i++ ) {
			// _temp += "[";
			
			_temp += " " + new String(new char[String.valueOf(this.size).length() - String.valueOf(i).length()]).replace("\0", " ") + i + "| ";

			for (int j = 0; j < this.size ; j++ ) {
			
				_temp += j == this.grid.length - 1 ? this.grid[i][j] : this.grid[i][j] + " ";
			
			}

			_temp += "\n";
		}

		return _temp;
	}
}