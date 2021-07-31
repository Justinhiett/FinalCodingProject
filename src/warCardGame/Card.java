package warCardGame;

public class Card {
	
	
	// Create card fields
	private int value;  
	private String name;  
	
	public Card() {}
	
	
	public Card(int value, String name) { 
		this.value = value; 
		this.name = name;
	} 
	
	// Getter and Setter Methods 
	public void setValue(int value) { 
		if (value >= 2 && value <= 14) { 
			this.value = value;
		} 	
	} 
	
	public int getValue() {
		return value;
	} 
	
	public void setName(String name) { 
		this.name = name; 
	}
	
	public String getName() {
		return name; 
	} 
	
	//Method to print the name and value of the card
	public void describe() {
		System.out.println("The value of the card is " + value); 
		System.out.println("The suit of the card is " + name);
	
	}
	
	
	
	
	
}
