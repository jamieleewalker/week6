package week6;

import java.util.*;

// This class represents a player in a card game.
class Player {

    // The name of the player.
    private String name;

    // The player's hand of cards.
    private List<Card> hand = new ArrayList<>();

    // The player's score.
    private int score = 0;

    // Constructs a new player with the specified name.
    public Player(String name) {
        // Set the player's name.
        this.name = name;
    }

    // Describes the player.
    public void describe() {
        // Print the player's name and score.
        System.out.println("Player name: " + name + ", Player score: " + score);

        // Iterate over the player's hand of cards and print each card.
        for (Card card : hand) {
            card.describe();
        }
    }

    // Flips the top card from the player's hand.
    public Card flip() {
        // Remove the top card from the player's hand.
        Card card = hand.remove(0);

        // Return the flipped card.
        return card;
    }

    // Draws a card from the deck and adds it to the player's hand.
    public void draw(Deck deck) {
        // Draw a card from the deck.
        Card card = deck.draw();

        // Add the card to the player's hand.
        hand.add(card);
    }

    // Returns true if the player is out of cards, false otherwise.
    public boolean isOut() {
        // Return true if the player's hand is empty, false otherwise.
        return hand.isEmpty();
    }

    // Increments the player's score by 1.
    public void incrementScore() {
        // Increment the player's score.
        score++;
    }

    // Returns the player's score.
    public int getScore() {
        // Return the player's score.
        return score;
    }
}