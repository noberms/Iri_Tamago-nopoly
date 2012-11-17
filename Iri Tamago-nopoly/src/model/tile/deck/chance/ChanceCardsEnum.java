package model.tile.deck.chance;

import model.tile.deck.Card;
import model.tile.deck.CardImpl;
import model.tile.deck.DataBundle;

enum ChanceCardsEnum {
	
	CHANCE1("Speeding fine 15.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CHANCE2("Pay school fees of 150.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CHANCE3("'Drunk in charge'. Fine 20.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CHANCE4("Bank pays you dividend of 20.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CHANCE5("Your building loan matures. Receive 150.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CHANCE6("You have won a crossword competition. Collect 100.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CHANCE7("Make general repairs on all your buildings. 25 per house, 100 per hotel.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CHANCE8("You are assessed for street repairs. 40 per house, 115 per hotel.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CHANCE9("Advance to Trafalgar Square. If you pass GO, collect 200.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CHANCE10("Advance to GO. Collect 200.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CHANCE11("Advance to Mayfair.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CHANCE12("Advance to Pall Mall. If you pass GO, collect 200.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CHANCE13("Take a trip to Marylebone Station. If you pass GO, collect 200.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CHANCE14("GO TO JAIL.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CHANCE15("Go back three spaces.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CHANCE16("Get out of jail free.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			});

	private final Card card;
	
	private ChanceCardsEnum(String message, CardImpl ci) {
		this.card = new Card(message, ci);
	}
	
	public Card card() { return card;}
	
}
