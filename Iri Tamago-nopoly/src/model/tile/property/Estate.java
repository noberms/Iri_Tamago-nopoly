package model.tile.property;

public class Estate extends Property {
	
	private final String color;
	private boolean buildable;
	private boolean sellable;
	private int houses;
	private final int[] rent;
	private final int housePrice;
	private final int hotelPrice;
	
	public Estate(String name, String image, int propertyPrice, int mortgageValue,
				  String color, int housePrice, int hotelPrice, int[] rent) {
		super(name, image, propertyPrice, mortgageValue);
		this.color = color;
		this.housePrice = housePrice;
		this.hotelPrice = hotelPrice;
		this.rent = rent;
	}

	public String getColor() {
		return this.color;
	}

	public boolean isBuildable() {
		return this.buildable;
	}

	public void setBuildable(boolean buildable) {
		this.buildable = buildable;
	}

	public boolean isSellable() {
		return this.sellable;
	}

	public void setSellable(boolean sellable) {
		this.sellable = sellable;
	}

	public int getHouses() {
		return this.houses;
	}

	public void setHouses(int houses) {
		this.houses = houses;
	}

	public int[] getRent() {
		return this.rent;
	}

	public int getHousePrice() {
		return this.housePrice;
	}

	public int getHotelPrice() {
		return this.hotelPrice;
	}
	
}
