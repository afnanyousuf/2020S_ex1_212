package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Steven Tedesco - May 26th, 2020
 * updated Comment name - May 26th, 2020
 */

import java.util.Scanner;
public class CardTrick {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);

            magicHand[i] = c;
        }

        //for(Card c:magicHand){
        //    System.out.printf("Suit: %s - Value: %d%n", c.getSuit(), c.getValue());
        //}

        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Enter your card value(1-13): ");
        Card userCard = new Card();
        userCard.setValue(in.nextInt());
        System.out.print("Enter your card suit (Hearts = 1, Diamonds = 2, Spades = 3, Clubs = 4): ");
        userCard.setSuit(Card.SUITS[in.nextInt()-1]);
        
        // and search magicHand here
        //Then report the result here

        for(int i = 0; i < magicHand.length; i++){
            if(userCard.getValue() == magicHand[i].getValue()
                && userCard.getSuit().equals(magicHand[i].getSuit())){
                System.out.println("Your card is card number " + (i+1));
                break;
            }else if(i == 6){
                System.out.println("No Match!");
            }
        }
    }

}
