package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Maria Pereyra (May 26, 2020)
 */
public class CardTrick {

    public static void main(String[] args) {

        // Create an array of Card Objects to hold a hand of seven cards.
        Card[] magicHand = new Card[7];

        /*
        Create seven Card Objects and assign random suit and value to each one.
        Then, store each object in the magic hand.
         */
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(randomValue());
            c.setSuit(Card.SUITS[randomSuit()]);
            //For debugging
            /*
            System.out.println("Card: " + i + " Suit: " + c.getSuit() + 
                    " value: " + c.getValue());
            */
            magicHand[i] = c;
        }
        
        // Create a Card Object and set its suit and value.
        Card luckyCard = new Card();
        luckyCard.setSuit("Spades");
        luckyCard.setValue(2);

        // Compare the lucky card with the hand and decide if there is a match.
        boolean match = false;
        for (Card card : magicHand) {
            if (luckyCard.getSuit().equals(card.getSuit())
                    && luckyCard.getValue() == card.getValue()) {
                match = true;
            }
        }

        // Display the result of the trick
        String result = match ? "Here is the lucky card!" : "Sorry, the lucky "
                + "card is not in the hand.";
        System.out.println(result);

    }

    /**
     * Generates a random number between 0 and 3. This method is used to assign
     * the suit of the card.
     *
     * @return a random number between 0 and 3
     */
    public static int randomSuit() {
        int out = (int) (Math.random() * 4);
        return out;
    }

    /**
     * Generates a random number between 1 and 13. This method is used to assign
     * a value to the card.
     *
     * @return a value between 1 and 13
     */
    public static int randomValue() {
        int out = (int) (Math.random() * 13 + 1);
        return out;

    }

}
