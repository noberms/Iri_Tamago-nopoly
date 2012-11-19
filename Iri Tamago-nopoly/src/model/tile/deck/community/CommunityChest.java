package model.tile.deck.community;

import java.util.HashMap;

import model.tile.deck.Card;
import model.tile.deck.Deck;

public class CommunityChest extends Deck {
	
	public CommunityChest(String image) {
		super("Community Chest", image);
		for(CommunityChestEnum cce : CommunityChestEnum.values()) {
			this.cards.put(cce.name(), cce.card());
		}
	}
	
	public CommunityChest(String image, HashMap<String, Card> cards) {
		super("Community Chest", image);
		this.cards = cards;
	}
	
}
