package model.tile;

import java.util.ArrayList;

public abstract class Deck extends Tile {
	
	private ArrayList<Card> cards;
		
	public ArrayList<Card> getCards() {
		return this.cards;
	}
	
	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
}
