package model.tile.property;

public class Station extends Property {
	
	private int[] rent;
	
	public Station(String name, int propertyPrice, int mortgageValue, int[] rent) {
		super(name, propertyPrice, mortgageValue);
		this.rent = rent;
	}

	public int[] getRent() {
		return this.rent;
	}

	public void setRent(int[] rent) {
		this.rent = rent;
	}
	
}
