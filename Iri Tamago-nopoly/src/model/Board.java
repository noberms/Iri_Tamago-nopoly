package model;

import java.util.HashMap;

import model.tile.Tax;
import model.tile.Tile;
import model.tile.TileWrapper;
import model.tile.property.Estate;
import model.tile.property.Station;
import model.tile.property.Utility;
import model.tile.deck.Card;
import model.tile.deck.chance.ChanceCards;
import model.tile.deck.community.CommunityChest;

public class Board {
	
	private final TileWrapper[] board = new TileWrapper[40];
	
	public Board() {

		ChanceCards cc = new ChanceCards("Chance Cards Image 1");
		HashMap<String, Card> ccCards = cc.getCards();
		CommunityChest cch = new CommunityChest("Community Chest Image 1");
		HashMap<String, Card> cchCards = cch.getCards();
		
		this.board[0] = new TileWrapper(653, 653, new Tile("Go", "Tile Image"));
		this.board[1] = new TileWrapper(591, 653, new Estate("Old Kent Road", "Estate Image", 60, 30, "brown", 50, 50, new int[]{2, 10, 30, 90,160,250}));
		this.board[2] = new TileWrapper(529, 653, cch);
		this.board[3] = new TileWrapper(467, 653, new Estate("WhiteChapel Road", "Estate Image", 60, 30, "brown", 50, 50, new int[]{4, 20, 60, 180, 320, 450}));
		this.board[4] = new TileWrapper(405, 653, new Tax("Income Tax", "Tax Image", 200));
		this.board[5] = new TileWrapper(343, 653, new Station("Kings Cross Station", "Estate Image", 200, 100, new int[]{25, 50, 100, 200}));
		this.board[6] = new TileWrapper(281, 653, new Estate("The Angel Islington", "Estate Image", 100, 50, "cyan", 50, 50, new int[] {6, 30, 90, 270, 400, 550}));
		this.board[7] = new TileWrapper(219, 653, cc);
		this.board[8] = new TileWrapper(157, 653, new Estate("Euston Road", "Estate Image", 100, 50, "cyan", 50, 50, new int[]{6, 30, 90, 270, 400, 550}));
		this.board[9] = new TileWrapper(95, 653, new Estate("Pentonville Road", "Estate Image", 120, 60, "cyan", 50, 50, new int[]{8, 40, 100, 300, 450, 600}));
		
		this.board[10] = new TileWrapper(0, 653, new Tile("In Jail", "Tile Image"));
		this.board[11] = new TileWrapper(0, 564, new Estate("Pall Mall", "Estate Image", 140, 70, "magenta", 100, 100, new int[]{10, 50, 150, 450, 625, 750}));
		this.board[12] = new TileWrapper(0, 503, new Utility("Electric Company", "Utility Image", 150, 75, new int[]{4, 10}));
		this.board[13] = new TileWrapper(0, 422, new Estate("Whitehall", "Estate Image", 140, 70, "magenta", 100, 100, new int[]{10, 50, 150, 450, 625, 750}));
		this.board[14] = new TileWrapper(0, 381, new Estate("Northumberland Avenue", "Estate Image", 160, 80, "magenta", 100, 100, new int[]{12, 60, 180, 500, 700, 900}));
		this.board[15] = new TileWrapper(0, 320, new Station("Marlyebone Station", "Station Image", 200, 100, new int[]{25, 50, 100, 200}));
		this.board[16] = new TileWrapper(0, 259, new Estate("Bow Street", "Estate Image", 180, 90, "orange", 100, 100, new int[]{14, 70, 200, 550, 750, 950}));
		this.board[17] = new TileWrapper(0, 198, new CommunityChest("Community Chest Image 2", ccCards));
		this.board[18] = new TileWrapper(0, 137, new Estate("Marlborough Street", "Estate Image", 180, 90, "orange", 100, 100, new int[]{14, 70 , 200, 550, 750, 950}));
		this.board[19] = new TileWrapper(0, 76, new Estate("Vine Street", "Estate Image", 200, 100, "orange", 100, 100, new int[]{16, 80, 220, 600, 800, 1000}));
		
		this.board[20] = new TileWrapper(0, 0, new Tile("Free Parking", "Tile Image"));
		this.board[21] = new TileWrapper(95, 0, new Estate("Strand", "Estate Image", 220, 110, "red", 150, 150, new int[]{18, 90, 250, 700, 875, 1050}));
		this.board[22] = new TileWrapper(157, 0, new CommunityChest("Community Chest Image 2", cchCards));
		this.board[23] = new TileWrapper(219, 0, new Estate("Fleet Street", "Estate Image", 220, 110, "red", 150, 150, new int[]{18, 90, 250, 700, 875, 1050}));
		this.board[24] = new TileWrapper(281, 0, new Estate("Trafalgar Square", "Estate Image", 240, 120, "red", 150, 150, new int[]{20, 100, 300, 750, 925, 1100}));
		this.board[25] = new TileWrapper(343, 0, new Station("Fenchurch St. Station", "Station Image", 200, 100, new int[]{25, 50, 100, 200}));
		this.board[26] = new TileWrapper(405, 0, new Estate("Leicester Square", "Estate Image", 260, 130, "yellow", 150, 150, new int[]{22, 110, 330, 800, 975, 1150}));
		this.board[27] = new TileWrapper(467, 0, new Estate("Coventry Street", "Estate Image", 260, 130, "yellow", 150, 150, new int[]{22, 110, 330, 800, 975, 1150}));
		this.board[28] = new TileWrapper(529, 0, new Utility("Water Works", "Utility Image", 150, 75, new int[]{4, 10}));
		this.board[29] = new TileWrapper(591, 0, new Estate("Piccadilly",  "Estate Image",280, 140, "yellow", 150, 150, new int[]{24, 120, 360, 850, 1025, 1200}));
		
		this.board[30] = new TileWrapper(653, 0, new Tile("Go to Jail", "Tile Image"));
		this.board[31] = new TileWrapper(653, 76, new Estate("Regent Street", "Estate Image", 300, 150, "green", 200, 200, new int[]{26, 130, 390, 900, 1100, 1275}));
		this.board[32] = new TileWrapper(653, 137, new Estate("Oxford Street", "Estate Image", 300, 150, "green", 200, 200, new int[]{26, 130, 390, 900, 1100, 1275}));
		this.board[33] = new TileWrapper(653, 198, new CommunityChest("Community Image 3", cchCards));
		this.board[34] = new TileWrapper(653, 259, new Estate("Bond Street", "Estate Image", 320, 160, "green", 200, 200, new int[]{28, 150, 450, 1000, 1200, 1400}));
		this.board[35] = new TileWrapper(653, 320, new Station("Liverpool Street Station", "Station Image", 200, 100, new int[]{25, 50, 100, 200}));
		this.board[36] = new TileWrapper(653, 381, new ChanceCards("Chance Cards Image 3", ccCards));
		this.board[37] = new TileWrapper(653, 442, new Estate("Park Lane", "Estate Image", 350, 30, "blue", 200, 50, new int[]{35, 175, 500, 1100, 1300, 1500}));
		this.board[38] = new TileWrapper(653, 442, new Tax("Super Tax", "Tax Image", 100));
		this.board[39] = new TileWrapper(653, 503, new Estate("Mayfair", "Estate Image", 400, 200, "blue", 200, 200, new int[]{50, 200, 600, 1400, 1700, 2000}));
		
	}
	
	public TileWrapper[] getBoard() {
		return this.board;
	}
	
	public TileWrapper getTileWrapper(int index) {
		return this.board[index];
	}
	
	public Tile getTile(int index) {
		return this.board[index].getTile();
	}
	
}