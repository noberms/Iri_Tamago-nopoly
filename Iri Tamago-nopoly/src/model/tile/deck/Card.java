package model.tile.deck;

public class Card {
	
	private final String message;
	private final String image;
	private final CardImpl ci;
	
	public Card(String message, String image, CardImpl ci) {
		this.message = message;
		this.image = image;
		this.ci = ci;
	}
	
	public void execute(DataBundle bundle) {
		this.ci.execute(bundle);
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public String getImage() {
		return this.image;
	}
	
	public CardImpl getCi() {
		return this.ci;
	}
	
}
