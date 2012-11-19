package model.tile;

public class Tax extends Tile {
	
	private final int amount;
	
	public Tax(String name, String image, int amount) {
		super(name, image);
		this.amount = amount;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public int payTax(int cash) {
		return cash - this.amount;
	}
	
}
