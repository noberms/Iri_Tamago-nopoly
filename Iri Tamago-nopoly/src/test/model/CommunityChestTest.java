package test.model;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

import model.tile.deck.Card;
import model.tile.deck.community.CommunityChest;

public class CommunityChestTest {
	
	public static void main(String[] args) {
		CommunityChest cc = new CommunityChest("Community Chest Image");
		System.out.println(cc.getName() + ":");
		Iterator<Entry<String, Card>> it = cc.getCards().entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Card> pairs = (Map.Entry<String, Card>) it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue().getMessage() + ", " + pairs.getValue().getImage());
		}
	}
	
}
