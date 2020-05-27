package pickacard;

/**
 * A class that models playing card Objects. Cards have a value (note that Ace =
 * 1, Jack -11, Queen =12, King = 13) A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers. This code is to be used in Exercise
 * 1. When you create your own branch, add your name as an author.
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Maria Pereyra (May 26, 2020)
 */
public class Card {

    private String suit; //clubs, spades, diamonds, hearts
    private int value;//1-13

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades",
        "Clubs"};

    /**
     * Constructs a Card Object with default suit and value.
     */
    public Card() {
        // Intentionally left blank
    }
    
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Places a suit for this card.
     *
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * Retrieves the value of this Card.
     *
     * @return the value of the Card
     */
    public int getValue() {
        return value;
    }

    /**
     * Places a value for this Card.
     *
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

}
