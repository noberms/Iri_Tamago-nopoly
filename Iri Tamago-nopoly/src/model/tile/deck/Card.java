package model.tile.deck;

public class Card {
	
	private String message;
	private CardImpl ci;
	
	public void execute() {
		this.ci.execute();
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CardImpl getCi() {
		return this.ci;
	}

	public void setCi(CardImpl ci) {
		this.ci = ci;
	}
	
}
