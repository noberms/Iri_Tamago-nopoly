package model;

import java.util.ArrayList;

import model.tile.property.Property;

public class Player {
	
	private final String name;
	private final Token token;
	private int cash;
	private ArrayList<Property> deeds;
	private boolean inJail;
	private int ownedStations;
	private int ownedUtilities;
	
	public Player(String name, Token token) {
		this.name = name;
		this.token = token;
		this.cash = 1500;
		this.inJail = false;
		this.deeds = new ArrayList<Property>();
	}

	public String getName() {
		return this.name;
	}

	public Token getToken() {
		return this.token;
	}

	public int getCash() {
		return this.cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public ArrayList<Property> getDeeds() {
		return this.deeds;
	}

	public void setDeeds(ArrayList<Property> deeds) {
		this.deeds = deeds;
	}

	public boolean isInJail() {
		return this.inJail;
	}

	public void setInJail(boolean inJail) {
		this.inJail = inJail;
	}
	
	public int getOwnedStations() {
		return this.ownedStations;
	}
	
	public void setOwnedStations(int ownedStations) {
		this.ownedStations = ownedStations;
	}
	
	public int getOwnedUtilities() {
		return this.ownedUtilities;
	}
	
	public void setOwnedUtilities(int ownedUtilities) {
		this.ownedUtilities = ownedUtilities;
	}
	
}
