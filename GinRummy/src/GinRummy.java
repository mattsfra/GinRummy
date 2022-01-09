import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GinRummy {
	private Deck deck;
	private Hand player1;
	private Hand player2;
	
	// setters for player hands
	public void setPlayer1Hand(Hand hand){
		player1 = hand;
	}
	public void setPlayer2Hand(Hand hand) {
		player2 = hand;
	}
	
	public void setDeck(Deck playingDeck) {
		deck = playingDeck;
	}
	
	public Hand getPlayer1Hand() {
		return player1;
	}
	
	public Hand getPlayer2Hand() {
		return player2;
	}
	
	public Deck getDeck() {
		return deck;
	}
	
	// true if pass, false if pile, only used for first turn
	public Boolean passOrPile(){
		String inputLine = null;
		System.out.print("Pass or pile?");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
		} catch(IOException e) {
			System.out.println("IOException: " + e);
			e.printStackTrace();
		}
		if(inputLine != null && inputLine.toLowerCase().equals("Pass")) {
			return true;
		}
		return false;
	}
	
	// true if deck, false if pile
	public Boolean deckOrPile() {
		String inputLine = null;
		System.out.print("Deck or Pile?");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
		} catch(IOException e) {
			System.out.println("IOException: " + e);
			e.printStackTrace();
		}
		if(inputLine != null && inputLine.toLowerCase().equals("Pass")) {
			return true;
		}
		return false;
	}
	
	// game initialisation
	
	public void initialiseGame() {
		deck = new Deck();
		deck.shuffle();
		player1 = new Hand();
		player2 = new Hand();
		
		player1.addCards(deck.drawCards(10));
		player2.addCards(deck.drawCards(10));
		
		// to do: opponents cards are flipped.	Player 2 cards must be flipped for player 1 and vice versa
	}
	
	
}
