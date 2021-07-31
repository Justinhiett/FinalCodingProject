package warCardGame;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck(); 
		Player player1 = new Player("Justin"); 
		Player player2 = new Player("Leslie");  
		
		
		
		//used for loop to add cards from each suit as well as their value to the deck.
		
		for (int i = 2; i <= 14; i++) {
			deck.addCard(new Card(i, "diamonds"));
		} 
		
		for (int i = 2; i <= 14; i++) {
			deck.addCard(new Card(i, "hearts")); 
			
		} 
		
		for (int i = 2; i <= 14; i++) {
			deck.addCard(new Card(i, "clubs"));
		}
		
		for (int i = 2; i <= 14; i++) { 
			deck.addCard(new Card(i, "spades"));
		} 
		
		
		
		
		 
		//randomize deck 
		deck.shuffle();
		
	
		//Deal card to each players hand.
		for (int i = 1; i <= 52; i+=2) {  
			player1.draw(deck);
			player2.draw(deck);
		} 
		
		player1.describe(); 
		player2.describe();
		
		//for each players hand flip cards to compare score 
		for (int i = 1; i <= 26; i++) {
			Card flipPlayer1 = player1.flip(); 
			Card flipPlayer2 = player2.flip(); 
			
			if (flipPlayer1.getValue() > flipPlayer2.getValue()) {
				player1.incrementScore();
			} 
			else if (flipPlayer2.getValue() > flipPlayer1.getValue()) {
				player2.incrementScore();
			}
			
		} 
		//print out each players score and determine the winner of the game.
		
		System.out.println("\n" + player1.name + ": " + player1.score); 
		System.out.println("\n" + player2.name + ": " + player2.score); 
		
		if (player1.score > player2.score) {
			System.out.println("\n" + player1.name); 	
		} 
		else if (player2.score > player1.score) {
			System.out.println("\n" + player2.name);  
		} 
		else {
			System.out.println("\ndraw");
		}
		
		
		
			
		
		 
		
	
		
		
		
		
		

	} 
		
}


