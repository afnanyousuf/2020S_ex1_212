package pickacard;

import java.util.Scanner;
import static pickacard.Card.SUITS;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Hangge Tuo
 * @author Paul Bonenfant
 * @Date Mar 27 2020
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        //Set my lucky card
        Card luckyCard = new Card();
        luckyCard.setSuit("Hearts");
        luckyCard.setValue(13);
        //set variable for condition
        boolean isValid = false;

        //Attach an initial value to the card at random
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int rnd1 = ((int) (Math.random() * 1000)) % 4;
            c.setSuit(SUITS[rnd1]);

            //c.setValue(insert call to random number generator here)
            int rnd2 = ((int) (Math.random() * 1000)) % 13 + 1;
            c.setValue(rnd2);
            //set magicHand value
            magicHand[i] = c;
        }
        System.out.println("Magic hand cards selection is complete.");
        System.out.println("-------------------------");

//        The follow code commented is just for test
//        System.out.println("The cards I have:");
//        for (int i = 0; i < magicHand.length; i++) {
//            System.out.println(magicHand[i].getSuit() + magicHand[i].getValue() + "\t");
//        }

        //Then report the result here
        
        //Show my lucky card
        System.out.println("My lucky card is "+luckyCard.getSuit()+luckyCard.getValue());
        System.out.println("---------------------------");
        for (int i = 0; i < magicHand.length; i++) {
            if (luckyCard.getSuit().equals(magicHand[i].getSuit()) && luckyCard.getValue() == magicHand[i].getValue()) {
                System.out.println("Congratulation!!! You got it. The card you chosen exites.");
                isValid = true;
                break;
            }
        }
        if (!isValid) {
            System.out.println("Sorry!!! You miss it. The card you chosen don't exites.");
        }
        System.out.println("-----------------------");
        System.out.println("The cards we have:");
        for (int i = 0; i < magicHand.length; i++) {
            System.out.print(magicHand[i].getSuit() + magicHand[i].getValue() + "\t");
        }
        System.out.println();
    }

}
