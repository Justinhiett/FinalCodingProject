package warCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;




public class Deck {
	Random random = new Random();
	
	// Create array list, to store 52 cards.
	private ArrayList<Card> cards = new ArrayList<>();
	
	//method to add cards to the deck.
	void addCard(Card c) {
		cards.add(c);
	} 
	
	//draw and return the top card from the deck.
	Card draw() {
		return cards.remove(0);
	}
	
	//randomize elements of the list.
	public void shuffle() { 
		 Collections.shuffle(cards);
		 
	
		
		
	} 
	//test method
	public void printDeck() {
		System.out.println(cards.size());
	}
	
	
	
	
	
	
	
}
 