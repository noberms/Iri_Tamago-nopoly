package model.tile.property;

public class Utility extends Property {
	
	private int rent[];
	
	public Utility(String name, String image, int propertyPrice, int mortgageValue, int[] rent) {
		super(name, image, propertyPrice, mortgageValue);
		this.rent = rent;
	}

	public int[] getRent() {
		return rent;
	}

	public void setRent(int[] rent) {
		this.rent = rent;
	}
	
}
