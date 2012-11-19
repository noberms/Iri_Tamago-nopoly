package test.model;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

import model.tile.deck.Card;
import model.tile.deck.chance.ChanceCards;

public class ChanceCardTest {
	
	public static void main(String[] args) {
		ChanceCards cc = new ChanceCards();
		System.out.println(cc.getName() + ":");
		Iterator<Entry<String, Card>> it = cc.getCards().entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Card> pairs = (Map.Entry<String, Card>) it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue().getMessage() + ", " + pairs.getValue().getImage());
		}
	}
	
}
