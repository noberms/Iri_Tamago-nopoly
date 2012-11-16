package model.tile;

public class TileWrapper {
	
	private Tile tile;
	private int coordX;
	private int coordY;
	
	public TileWrapper(Tile tile, int coordX, int coordY) {
		this.tile = tile;
		this.coordX = coordX;
		this.coordY = coordY;
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
