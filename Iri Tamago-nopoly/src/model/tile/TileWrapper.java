package model.tile;

public class TileWrapper {
	
	private Tile tile;
	
	public TileWrapper(Tile tile) {
		this.tile = tile;
	}

	public Tile getTile() {
		return this.tile;
	}

	public void setTile(Tile tile) {
		this.tile = tile;
	}
	
}
