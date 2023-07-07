package week6;

// This class represents a playing card.
public class Card {

    // The value of the card.
    private int value;

    // The name of the card.
    private String name;

    // Constructs a new card with the specified value and name.
    public Card(int value, String name) {
        // Set the value of the card.
        this.value = value;

        // Set the name of the card.
        this.name = name;
    }

    // Gets the value of the card.
    public int getValue() {
        // Return the value of the card.
        return value;
    }

    // Sets the value of the card.
    public void setValue(int value) {
        // Set the value of the card.
        this.value = value;
    }

    // Gets the name of the card.
    public String getName() {
        // Return the name of the card.
        return name;
    }

    // Sets the name of the card.
    public void setName(String name) {
        // Set the name of the card.
        this.name = name;
    }

    // Describes the card.
    public void describe() {
        // Print the value and name of the card.
        System.out.println("Card value: " + value + ", Card name: " + name);
    }
}

// An enum representing the suits of a playing card.
enum Suit {

    // The spades suit.
    SPADES,

    // The hearts suit.
    HEARTS,

    // The diamonds suit.
    DIAMONDS,

    // The clubs suit.
    CLUBS
}