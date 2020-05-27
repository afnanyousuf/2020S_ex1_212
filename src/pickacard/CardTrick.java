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
        //initial user's choice of card
        Card choice = new Card();
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

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("You will be asked for one card.");
        System.out.println("Please choose the suit:");
        
        //Judge whether the suit entered by the user is valid
        do {
            for (int i = 0; i < SUITS.length; i++) {
                System.out.print(SUITS[i] + "\t");
            }
            System.out.println("");
            System.out.println("------------------------");
            String input = new Scanner(System.in).nextLine();
            // and search magicHand here
            for (int i = 0; i < SUITS.length; i++) {
                if (input.trim().equals(SUITS[i])) {
                    isValid = true;
                    choice.setSuit(input);
                    break;
                }
            }
            if (!isValid) {
                System.out.println("You enter wrong suit, please enter again.");
            }
        } while (!isValid);
        
//        Judge whether the value entered by the user is valid
        isValid = false;
        do {
            System.out.println("Please choose the value between 1 to 13:");
            int input = -1;
            try {
                input = new Scanner(System.in).nextInt();

            } catch (Exception e) {
                System.out.println("The number you entered is not a number.");
                continue;
            }
            if (input <= 13 && input >= 1) {
                isValid = true;
                choice.setValue(input);
            } else {
                System.out.println("The number you entered is an invaild vlaue. Please re-enter:");
            }
        } while (!isValid);

        //Then report the result here
        isValid = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (choice.getSuit().equals(magicHand[i].getSuit()) && choice.getValue() == magicHand[i].getValue()) {
                System.out.println("Congratulation!!! You got it. The card you chosen exites.");
                isValid = true;
                break;
            }
        }
        if (!isValid) {
            System.out.println("Sorry!!! You miss it. The card you chosen don't exites.");
        }
        System.out.println("-----------------------");
        System.out.println("The cards I have:");
        for (int i = 0; i < magicHand.length; i++) {
            System.out.print(magicHand[i].getSuit() + magicHand[i].getValue() + "\t");
        }
        System.out.println();
    }

}
