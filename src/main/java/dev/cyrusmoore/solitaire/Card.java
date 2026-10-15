package dev.cyrusmoore.solitaire;

// Creates a class which records the rank and suit of a card
record Card(Rank rank, Suit suit) {



    // The possible colours a card can have
    private enum PossibleColours {
        RED,
        BLACK
    }

    // The possible suits a card can be - each with an assigned colour
    enum Suit {
        HEARTS(PossibleColours.RED),
        DIAMONDS(PossibleColours.RED),
        CLUBS(PossibleColours.BLACK),
        SPADES(PossibleColours.BLACK);

        // Creates a variable that can be accessed to get colour
        final PossibleColours colour;

        // Constructs Suit to have a colour
        Suit(PossibleColours tempColour) {
            this.colour = tempColour;
        }

    }


    // The possible rank a card can be - each with an assigned value
    enum Rank {
        ACE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);

        // Create a variable that can be accessed to get the value
        final int value;

        // Constructs Rank to have a value
        Rank(int value) {
            this.value = value;
        }
    }



}
