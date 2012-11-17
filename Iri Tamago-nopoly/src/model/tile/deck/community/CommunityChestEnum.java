package model.tile.deck.community;

import model.tile.deck.Card;
import model.tile.deck.CardImpl;
import model.tile.deck.DataBundle;

public enum CommunityChestEnum {

	COMMUNITY1("Pay hospital fee 100.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	COMMUNITY2("Pay a 10 fine or take a chance.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	COMMUNITY3("Pay your insurance premium 20.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	CCOMMUNITY4("Doctor's fee. Pay 50.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	COMMUNITY5("Bank error in your favor. Collect 200.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	COMMUNITY6("You have won second prize in a beauty contest. Collect 10.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	COMMUNITY7("Income tax refund. Collect 20.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	COMMUNITY8("From sale of stock, you get 50.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	COMMUNITY9("Receive interest on 7% preference shares 25.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	COMMUNITY10("Annuity matures. Collect 100.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	COMMUNITY11("You inherit 100.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	COMMUNITY12("It's your birthday. Collect 100 from each player.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	COMMUNITY13("Advance to GO, collect 200.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	COMMUNITY14("Go back to Old Kent Road.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	COMMUNITY15("GO TO JAIL.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			}),
	COMMUNITY16("Get out of jail free.", 
			new CardImpl(){
				public void execute(DataBundle bundle){
					
				}
			});

	private final Card card;
	
	private CommunityChestEnum(String message, CardImpl ci) {
		this.card = new Card(message, ci);
	}
	
	public Card card() { return card;}
}
