package model.tile.property;

public class Estate extends Property {
	
	private String color;
	private boolean buildable;
	private boolean sellable;
	private int houses;
	private int[] rent;
	private int housePrice;
	private int hotelPrice;
	
	public Estate(String name, int propertyPrice, int mortgageValue,
				  String color, int[] rent, int housePrice, int hotelPrice) {
		super(name, propertyPrice, mortgageValue);
		this.color = color;
		this.rent = rent;
		this.housePrice = housePrice;
		this.hotelPrice = hotelPrice;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public void setRent(int[] rent) {
		this.rent = rent;
	}

	public int getHousePrice() {
		return this.housePrice;
	}

	public void setHousePrice(int housePrice) {
		this.housePrice = housePrice;
	}

	public int getHotelPrice() {
		return this.hotelPrice;
	}

	public void setHotelPrice(int hotelPrice) {
		this.hotelPrice = hotelPrice;
	}
	
}
