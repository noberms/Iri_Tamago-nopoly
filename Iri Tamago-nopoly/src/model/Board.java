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
	
	private static Board board;
	private final TileWrapper[] tiles;
	
	private Board() {
		
		HashMap<String, Card> communityChest = new CommunityChest(null).getCards();
		HashMap<String, Card> chanceCards = new ChanceCards(null).getCards();
		
		this.tiles = new TileWrapper[] {
						new TileWrapper(new Tile("Go", "Tile Image")),
						new TileWrapper(new Estate("Old Kent Road", "Estate Image", 60, 30, "brown", 50, 50, new int[]{2, 10, 30, 90,160,250})),
						new TileWrapper(new CommunityChest("Community Chest 1", "Community Chest Image 1", communityChest)),
						new TileWrapper(new Estate("WhiteChapel Road", "Estate Image", 60, 30, "brown", 50, 50, new int[]{4, 20, 60, 180, 320, 450})),
						new TileWrapper(new Tax("Income Tax", "Tax Image", 200)),
						new TileWrapper(new Station("Kings Cross Station", "Estate Image", 200, 100, new int[]{25, 50, 100, 200})),
						new TileWrapper(new Estate("The Angel Islington", "Estate Image", 100, 50, "cyan", 50, 50, new int[] {6, 30, 90, 270, 400, 550})),
						new TileWrapper(new ChanceCards("Chance Cards 1", "Chance Cards Image 1", chanceCards)),
						new TileWrapper(new Estate("Euston Road", "Estate Image", 100, 50, "cyan", 50, 50, new int[]{6, 30, 90, 270, 400, 550})),
						new TileWrapper(new Estate("Pentonville Road", "Estate Image", 120, 60, "cyan", 50, 50, new int[]{8, 40, 100, 300, 450, 600})),
						new TileWrapper(new Tile("In Jail", "Tile Image")),
		
						new TileWrapper(new Estate("Pall Mall", "Estate Image", 140, 70, "magenta", 100, 100, new int[]{10, 50, 150, 450, 625, 750})),
						new TileWrapper(new Utility("Electric Company", "Utility Image", 150, 75, new int[]{4, 10})),
						new TileWrapper(new Estate("Whitehall", "Estate Image", 140, 70, "magenta", 100, 100, new int[]{10, 50, 150, 450, 625, 750})),
						new TileWrapper(new Estate("Northumberland Avenue", "Estate Image", 160, 80, "magenta", 100, 100, new int[]{12, 60, 180, 500, 700, 900})),
						new TileWrapper(new Station("Marlyebone Station", "Station Image", 200, 100, new int[]{25, 50, 100, 200})),
						new TileWrapper(new Estate("Bow Street", "Estate Image", 180, 90, "orange", 100, 100, new int[]{14, 70, 200, 550, 750, 950})),
						new TileWrapper(new CommunityChest("Community Chest 2", "Community Chest Image 2", communityChest)),
						new TileWrapper(new Estate("Marlborough Street", "Estate Image", 180, 90, "orange", 100, 100, new int[]{14, 70 , 200, 550, 750, 950})),
						new TileWrapper(new Estate("Vine Street", "Estate Image", 200, 100, "orange", 100, 100, new int[]{16, 80, 220, 600, 800, 1000})),
						new TileWrapper(new Tile("Free Parking", "Tile Image")),
		
						new TileWrapper(new Estate("Strand", "Estate Image", 220, 110, "red", 150, 150, new int[]{18, 90, 250, 700, 875, 1050})),
						new TileWrapper(new ChanceCards("Chance Cards 2", "Chance Cards Image 2", chanceCards)),
						new TileWrapper(new Estate("Fleet Street", "Estate Image", 220, 110, "red", 150, 150, new int[]{18, 90, 250, 700, 875, 1050})),
						new TileWrapper(new Estate("Trafalgar Square", "Estate Image", 240, 120, "red", 150, 150, new int[]{20, 100, 300, 750, 925, 1100})),
						new TileWrapper(new Station("Fenchurch St. Station", "Station Image", 200, 100, new int[]{25, 50, 100, 200})),
						new TileWrapper(new Estate("Leicester Square", "Estate Image", 260, 130, "yellow", 150, 150, new int[]{22, 110, 330, 800, 975, 1150})),
						new TileWrapper(new Estate("Coventry Street", "Estate Image", 260, 130, "yellow", 150, 150, new int[]{22, 110, 330, 800, 975, 1150})),
						new TileWrapper(new Utility("Water Works", "Utility Image", 150, 75, new int[]{4, 10})),
						new TileWrapper(new Estate("Piccadilly",  "Estate Image",280, 140, "yellow", 150, 150, new int[]{24, 120, 360, 850, 1025, 1200})),
						new TileWrapper(new Tile("Go to Jail", "Tile Image")),
		
						new TileWrapper(new Estate("Regent Street", "Estate Image", 300, 150, "green", 200, 200, new int[]{26, 130, 390, 900, 1100, 1275})),
						new TileWrapper(new Estate("Oxford Street", "Estate Image", 300, 150, "green", 200, 200, new int[]{26, 130, 390, 900, 1100, 1275})),
						new TileWrapper(new CommunityChest("Community Chest 3", "Community Chest Image 3", communityChest)),
						new TileWrapper(new Estate("Bond Street", "Estate Image", 320, 160, "green", 200, 200, new int[]{28, 150, 450, 1000, 1200, 1400})),
						new TileWrapper(new Station("Liverpool Street Station", "Station Image", 200, 100, new int[]{25, 50, 100, 200})),
						new TileWrapper(new ChanceCards("Chance Cards 3", "Chance Cards Image 3", chanceCards)),
						new TileWrapper(new Estate("Park Lane", "Estate Image", 350, 30, "blue", 200, 50, new int[]{35, 175, 500, 1100, 1300, 1500})),
						new TileWrapper(new Tax("Super Tax", "Tax Image", 100)),
						new TileWrapper(new Estate("Mayfair", "Estate Image", 400, 200, "blue", 200, 200, new int[]{50, 200, 600, 1400, 1700, 2000}))
					};
	}
	
	public static Board getInstance() {
		if(board == null) {
			board = new Board();
		}
		return board;
	}
	
	public TileWrapper[] getTiles() {
		return this.tiles;
	}
	
	public Tile getTile(int index) {
		return this.tiles[index].getTile();
	}
	
}
