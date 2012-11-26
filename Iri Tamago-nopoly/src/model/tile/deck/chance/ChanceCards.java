package model.tile.deck.chance;

import java.util.HashMap;

import model.tile.deck.Card;
import model.tile.deck.Deck;

public class ChanceCards extends Deck {
	
	public ChanceCards(String image) {
		super("Chance Cards", image);
		for(ChanceCardsEnum cce : ChanceCardsEnum.values()) {
			this.cards.put(cce.name(), cce.card());
		}
	}
	
	public ChanceCards(String name, String image) {
		super(name, image);
		for(ChanceCardsEnum cce : ChanceCardsEnum.values()) {
			this.cards.put(cce.name(), cce.card());
		}
	}
	
	public ChanceCards(String image, HashMap<String, Card> cards) {
		super("Chance Cards", image);
		this.cards = cards;
	}
	
	public ChanceCards(String name, String image, HashMap<String, Card> cards) {
		super(name, image);
		this.cards = cards;
	}
	
}
