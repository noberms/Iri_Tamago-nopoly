package model.tile.deck;

import java.util.HashMap;
import model.tile.Tile;

public abstract class Deck extends Tile {
	
	protected HashMap<String, Card> cards;
	
	protected Deck(String name, String image) {
		super(name, image);
		this.cards = new HashMap<String, Card>();
	}
	
	public HashMap<String, Card> getCards() {
		return this.cards;
	}
	
	public void setCards(HashMap<String, Card> cards) {
		this.cards = cards;
	}
	
}
