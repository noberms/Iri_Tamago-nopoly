package model.tile.deck;

import java.util.HashMap;
import model.tile.Tile;

public abstract class Deck extends Tile {
	
	protected HashMap<String, Card> cards;
	
	public Deck(String name) {
		super(name);
		this.cards = new HashMap<String, Card>();
	}
	
	public HashMap<String, Card> getCards() {
		return this.cards;
	}
	
	public void setCards(HashMap<String, Card> cards) {
		this.cards = cards;
	}
	
}
