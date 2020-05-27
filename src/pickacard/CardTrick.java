package pickacard;

import java.util.Scanner;

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
            System.out.println("Card: " + i + "Suit: " + c.getSuit() + 
                    " value: " + c.getValue());
            */
            magicHand[i] = c;
        }

        // Create Scanner Object to get input from user.
        Scanner input = new Scanner(System.in);

        /*
        Prompt the user to choose a card. Set suit and value for the user's 
        card based on user's input. 
         */
        System.out.println("Pick a card, any card!\n"
                + "First pick a suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = input.nextLine();

        System.out.println("Now, choose a value for the card "
                + "(whole number between 1 and 13): ");
        int userValue = Integer.parseInt(input.nextLine());

        // Compare the user's card with the hand and decide if there is a match.
        boolean match = false;
        for (Card card : magicHand) {
            if (userSuit.equalsIgnoreCase(card.getSuit())
                    && userValue == card.getValue()) {
                match = true;
            }
        }

        // Display the result of the trick
        String result = match ? "Here is your card!" : "Sorry, your card is not"
                + " in the hand.";
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
