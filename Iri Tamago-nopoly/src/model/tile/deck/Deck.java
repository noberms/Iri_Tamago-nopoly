package model.tile.deck;

import java.util.ArrayList;

import model.tile.Tile;

public abstract class Deck extends Tile {
	
	private ArrayList<Card> cards;
		
	public ArrayList<Card> getCards() {
		return this.cards;
	}
	
	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
}
