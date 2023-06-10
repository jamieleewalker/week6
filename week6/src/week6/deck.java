package week6;
import java.util.*;

class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        for (int i = 2; i <= 14; i++) {
            for (Suit suit : Suit.values()) {
                getCards().add(new Card(i, suit.name()));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(getCards());
    }

    public Card draw() {
        return getCards().remove(0);
    }

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
}