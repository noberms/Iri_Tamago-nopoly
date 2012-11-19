package model.tile;

public class TileWrapper {
	
	private Tile tile;
	private int coordX;
	private int coordY;
	
	public TileWrapper(int coordX, int coordY, Tile tile) {
		this.coordX = coordX;
		this.coordY = coordY;
		this.tile = tile;
	}

	public Tile getTile() {
		return this.tile;
	}

	public void setTile(Tile tile) {
		this.tile = tile;
	}

	public int getCoordX() {
		return this.coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return this.coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
	
}
