package model.tile.property;

public class Station extends Property {
	
	private final int[] rent;
	
	public Station(String name, String image, int propertyPrice, int mortgageValue, int[] rent) {
		super(name, image, propertyPrice, mortgageValue);
		this.rent = rent;
	}

	public int[] getRent() {
		return this.rent;
	}
	
}
