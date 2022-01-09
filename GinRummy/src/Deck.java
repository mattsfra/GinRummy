import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {

	private LinkedList<Card> cards;
	
	/**
	 * Creates the deck and puts all cards, excluding jokers,
	 * into the deck. The deck is not shuffled after the
	 * object has been created.
	 */
	public Deck() {
		cards = new LinkedList<>();
		
		for(int suit = 0; suit < 4; suit++) {
			for(int v = 1; v <= 13; v++) {
				cards.add(new Card(v, suit));
			}
		}
		
		
	}
	
	/**
	 * Shuffles the deck
	 */
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	/**
	 * Returns the number of cards left in the deck
	 * @return the number of cards left in the deck
	 */
	public int cardsLeft() {
		return cards.size();
	}

	/**
	 * Removes a card from the deck and returns it
	 * @return the card drawn
	 */
	public Card drawCard() {
		return cards.removeFirst();
	}
	
	
	// draws a number of cards
	public List<Card> drawCards(int amount){
		List<Card> draw = new LinkedList<>();
		for(int i=0;i<amount;i++) {
			draw.add(this.drawCard());
		}
		return draw;
	}
	
	public void addCardToBottom(Card c) {
		cards.add(cards.size()-1, c);
	}
	
}

