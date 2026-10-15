package dev.cyrusmoore.solitaire;

class Main {
    static void main() {

        // Create a deck
        Deck deck = new Deck();

        // Print deck
        for (Card card : deck.cardsInDeck) {
            System.out.println(card.suit().colour + " " + card.rank() + " of " + card.suit() + " (" + card.rank().value + ")");
        }

    }
}