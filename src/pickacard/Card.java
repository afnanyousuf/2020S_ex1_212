package pickacard;

/**
 * A class that models playing card Objects. Cards have a value (note that Ace = 1, Jack -11, Queen =12, King = 13) A
 * suit (clubs, hearts, spades, diamonds). There are 52 cards in a deck, no jokers. This code is to be used in Exercise
 * 1. When you create your own branch, add your name as an author.
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Hanan Fadel, May 2020
 */
public class Card {
    
    private String suit; //clubs, spades, diamonds, hearts
    private int value;//1-13

    // Class constructor
        public Card() {
        
    }
    
    public Card(int value, String suit) {
        this.value = value;
        this.suit= suit;
    }
    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    public String getValueAsString() {

        switch (value) {
            case 1:
                return "Ace";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
        }
        return "" + value;

    }

   
    public boolean equals(Card userCard) {
        return this.value == userCard.value && this.suit == userCard.suit;
    }

    // Display the card 
    public String toString() {
        return getValueAsString() + " of " + getSuit();
    }

}
