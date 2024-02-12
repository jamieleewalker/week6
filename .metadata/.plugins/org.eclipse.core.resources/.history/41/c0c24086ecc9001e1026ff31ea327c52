package week6;

import java.util.*;

// This class represents a deck of cards.
class Deck {

    // A list of cards in the deck.
    private List<Card> cards = new ArrayList<>();

    // Constructs a new deck of cards.
    public Deck() {
        // Iterate over the values 2-14 and for each value, iterate over the suits and add a new card to the deck.
        for (int i = 2; i <= 14; i++) {
            for (Suit suit : Suit.values()) {
                getCards().add(new Card(i, suit.name()));
            }
        }
    }

    // Shuffles the deck of cards.
    public void shuffle() {
        // Shuffle the deck of cards using the `Collections.shuffle()` method.
        Collections.shuffle(getCards());
    }

    // Draws a card from the deck and returns it.
    public Card draw() {
        // Remove the top card from the deck and return it.
        return getCards().remove(0);
    }

	// Getter and setter for the `cards` property.
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
}