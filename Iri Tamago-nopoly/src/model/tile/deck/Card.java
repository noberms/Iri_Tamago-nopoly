package model.tile.deck;

public class Card {
	
	private final String message;
	private final CardImpl ci;
	
	public Card(String message, CardImpl ci) {
		this.message = message;
		this.ci = ci;
	}
	
	public void execute(DataBundle bundle) {
		this.ci.execute(bundle);
	}

	public String getMessage() {
		return this.message;
	}

	public CardImpl getCi() {
		return this.ci;
	}
	
}
