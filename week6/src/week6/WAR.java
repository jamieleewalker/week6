package week6;
import java.util.*;
public class WAR {

    public static void main(String[] args) {

        // Create two players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Shuffle the deck
        Deck deck = new Deck();
        deck.shuffle();

        // Deal the cards to the players
        for (int i = 0; i < deck.getCards().size(); i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        // Start the game
        while (!player1.isOut() && !player2.isOut()) {

            // Play a round of War
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();

            // Determine the winner of the round
            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
            } else if (player2Card.getValue() > player1Card.getValue()) {
                player2.incrementScore();
            } else {
                // War!
                for (int i = 0; i < 3; i++) {
                    player1.draw(deck);
                    player2.draw(deck);
                }

                // Determine the winner of the War
                Card warCard1 = player1.flip();
                Card warCard2 = player2.flip();
                if (warCard1.getValue() > warCard2.getValue()) {
                    player1.incrementScore();
                } else if (warCard2.getValue() > warCard1.getValue()) {
                    player2.incrementScore();
                }
            }
            // Announce the winner
            if (player1.getScore() > player2.getScore()) {
                System.out.println("Player 1 wins with a score of " + player1.getScore());
            } else if (player2.getScore() > player1.getScore()) {
                System.out.println("Player 2 wins with a score of " + player2.getScore());
            } else {
                System.out.println("Draw!");
        }
    }
        }
}
