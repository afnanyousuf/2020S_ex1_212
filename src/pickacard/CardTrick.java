package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Hanan Fadel, May 2020
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13 + 1));
            //  System.out.println("the value= " + c.getValue());

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[((int) (Math.random() * 3))]);
            //System.out.println("The suit = " + c.getSuit());

            magicHand[i] = c;
        }

        // /display the MagicHand
        System.out.println("The Magic Hand contains: ");
        for (int i = 0; i < magicHand.length; i++) {
            System.out.println((i + 1) + "- " + magicHand[i]);
        }

        //Ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a card Value between (1-13)? ");
        int userValue = input.nextInt();

        System.out.print("Enter a card suit between (0-3)? ");
        int userSuit = input.nextInt();

        // Create user card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userCard.getSuitAsString(userSuit));
        System.out.println("\nThe user entered: " + userCard);

        // Search the card in the Magic Hand
        boolean isFound = searchMagicHand(magicHand, userCard);

        //Display the result
        display(isFound);

    }

    // search magicHand here
    //Then report the result here
    public static boolean searchMagicHand(Card[] magicHand, Card findCard) {
        for (int i = 0; i < magicHand.length; i++) {

            if (magicHand[i].equals(findCard)) {
                return true;
            }
        }
        return false;
    }

    public static void display(boolean isFound) {
        if (isFound) {
            System.out.println("Yess, your card is in the magic Hand!!");
        } else {
            System.out.println("Sorry, your card is not in the magic Hand");
        }
    }

}
