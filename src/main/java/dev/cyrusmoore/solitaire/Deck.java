package dev.cyrusmoore.solitaire;
import java.util.ArrayList;

// Creates a class which creates and populates cardsInDeck
class Deck {



    // Create a variable that can be accessed to get the cardsInDeck
    final ArrayList<Card> cardsInDeck = new ArrayList<>();

    // Populates cardsInDeck with all 52 cards
    Deck() {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cardsInDeck.add(new Card(rank, suit));
            }
        }
    }



}
