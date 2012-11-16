package model.tile;

public class Tile {
	
	private String name;
	
	public Tile() {
		this.name = "";
	}
	
	public Tile(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
