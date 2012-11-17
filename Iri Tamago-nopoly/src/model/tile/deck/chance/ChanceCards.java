package model.tile.deck.chance;

import model.tile.deck.Deck;

public class ChanceCards extends Deck {
	
	public ChanceCards(String name) {
		super(name);
		for(ChanceCardsEnum cce : ChanceCardsEnum.values()) {
			this.cards.put(cce.name(), cce.card());
		}
	}
	
}
