package model.tile.property;

import model.Player;
import model.tile.Tile;

public class Property extends Tile{
	
	private Player owner;
	private final int propertyPrice;
	private final int mortgageValue;
	private boolean monopoly;
	private boolean mortgaged;
	
	public Property(String name, String image, int propertyPrice, int mortgageValue) {
		super(name, image);
		this.owner = null;
		this.propertyPrice = propertyPrice;
		this.mortgageValue = mortgageValue;
		this.monopoly = false;
		this.mortgaged = false;
	}

	public Player getOwner() {
		return this.owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public int getPrice() {
		return this.propertyPrice;
	}

	public int getMortgageValue() {
		return this.mortgageValue;
	}

	public boolean isMonopoly() {
		return this.monopoly;
	}

	public void setMonopoly(boolean monopoly) {
		this.monopoly = monopoly;
	}

	public boolean isMortgaged() {
		return this.mortgaged;
	}

	public void setMortgaged(boolean mortgaged) {
		this.mortgaged = mortgaged;
	}
	
}
