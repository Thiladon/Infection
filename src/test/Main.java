package src.test;

import src.test.gridtest.Grid;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("\033[H\033[2J");
		System.out.flush();

		int[][] newGrid = {{ 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 2 }};

		Grid grid = new Grid(10);

		System.out.println(grid.toString());
		
		grid.forceGrid(newGrid);

		System.out.println(grid.toString());
		
	}
}