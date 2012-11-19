package model.tile;

public class Tile {
	
	private final String name;
	private final String image;
	
	public Tile(String name, String image) {
		this.name = name;
		this.image = image;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getImage() {
		return this.image;
	}
	
}
