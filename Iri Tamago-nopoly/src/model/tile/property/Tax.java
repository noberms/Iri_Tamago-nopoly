package model.tile.property;

import model.tile.Tile;

public class Tax extends Tile {
	
	private int amount;
	
	public Tax(String name, int amount) {
		super(name);
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
