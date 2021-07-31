package warCardGame;

import java.util.ArrayList;


public class Player {
	
	//Use array list to store drawn cards into players hand.  Fields for players score and name.
	public ArrayList<Card> hand = new ArrayList<>();  
	public int score = 0; 
	public String name; 
	
	public Player(String name) {
		this.name = name;
	}
	
	//print information about the player as well as card in hand
	void describe() {
		System.out.println("\nPlayer: " + name + "\n");  
		
	
		
		for (Card c : hand) {
			c.describe();
		}	
	}
	
	Card flip() { 
		return hand.remove(0); 
		
	}
	
	//draw card from the deck and add it to the hand
	void draw(Deck deck) { 
		Card playerCard = deck.draw();  
		hand.add(playerCard); 
		
	} 
	
	//method used to increment score based on the players hand
	void incrementScore() { 
		score += 1; 
		
	} 
	
	
	
	
}
