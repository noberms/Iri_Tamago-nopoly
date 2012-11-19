package model.tile.deck.community;

import model.tile.deck.Deck;

public class CommunityChest extends Deck {
	
	public CommunityChest() {
		super("Community Chest");
		for(CommunityChestEnum cce : CommunityChestEnum.values()) {
			this.cards.put(cce.name(), cce.card());
		}
	}
	
}
