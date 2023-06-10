package week6;
import java.util.*;

class Player {

private String name;
private List<Card> hand = new ArrayList<>();
private int score = 0;

public Player(String name) {
    this.name = name;
}

public void describe() {
    System.out.println("Player name: " + name + ", Player score: " + score);
    for (Card card : hand) {
        card.describe();
    }
}

public Card flip() {
    return hand.remove(0);
}

public void draw(Deck deck) {
    hand.add(deck.draw());
}
public boolean isOut() {
    return hand.isEmpty();
}

public void incrementScore() {
    score++;
}
public int getScore() {
    return score;
}
}