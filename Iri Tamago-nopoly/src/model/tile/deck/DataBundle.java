package model.tile.deck;

import model.Player;

public class DataBundle {
	
	private Player player;
	
	public DataBundle(Player player) {
		this.player = player;
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
}
