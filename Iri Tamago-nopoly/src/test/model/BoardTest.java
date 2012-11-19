package test.model;

import model.Board;
import model.tile.TileWrapper;

public class BoardTest {
	
	public static void main(String[] args) {
		Board board = new Board();
		int x = 1;
		for(TileWrapper tileWrapper : board.getBoard()) {
			System.out.println(x++ + " " + tileWrapper.getTile().getName() + " (" + tileWrapper.getCoordX() + ", " + tileWrapper.getCoordY() + ")");
		}
	}

}
