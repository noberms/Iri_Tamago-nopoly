package test.model;

import model.Board;
import model.tile.TileWrapper;

public class BoardTest {
	
	public static void main(String[] args) {
		Board board = Board.getInstance();
		int x = 0;
		for(TileWrapper tileWrapper : board.getTiles()) {
			System.out.println(x++ + " " + tileWrapper.getTile().getName() + " (" + tileWrapper.getTile().getImage() + ")");
		}
	}

}
