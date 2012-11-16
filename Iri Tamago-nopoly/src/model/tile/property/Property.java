package model.tile.property;

import model.Player;
import model.tile.Tile;

public class Property extends Tile{
	
	private String name;
	private Player owner;
	private int propertyPrice;
	private int mortgageValue;
	private boolean monopoly;
	private boolean mortgaged;
	
	public Property(String name, int propertyPrice, int mortgageValue) {
		super(name);
		this.owner = null;
		this.propertyPrice = propertyPrice;
		this.mortgageValue = mortgageValue;
		this.monopoly = false;
		this.mortgaged = false;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void setPrice(int propertyPrice) {
		this.propertyPrice = propertyPrice;
	}

	public int getMortgageValue() {
		return this.mortgageValue;
	}

	public void setMortgageValue(int mortgageValue) {
		this.mortgageValue = mortgageValue;
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
