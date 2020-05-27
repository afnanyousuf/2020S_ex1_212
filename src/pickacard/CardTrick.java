package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Stanislav Kushch
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            //assigns value from 1 to 13
            c.setValue((int) (Math.random() * 13 + 1));
            
            //assigns value from 0-3
            c.setSuit(Card.SUITS[((int) (Math.random() * 4))]);
           
            //puts Card c into magicHand array
            magicHand[i] = c;
        }
        
        Scanner input = new Scanner(System.in);
        Card luckyCard = new Card ();
        
        System.out.println("Please enter the value of the card from 1 to 13");
        luckyCard.setValue(input.nextInt());
        
        System.out.println("Enter your card suit (Hearts = 1, Diamonds = 2, Spades = 3, Clubs = 4): ");
        luckyCard.setSuit(Card.SUITS[input.nextInt()-1]);
        
        
       
        boolean match = false;

        //checks if the user's card matches the one of the cards in the array
          for (int i = 0; i < magicHand.length; i++) {
            if (luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equals(magicHand[i].getSuit())) {
                System.out.println("Card was found in the magic hand!");
                match = true;
                break;
            }
        }
        
        if (!match) {
            System.out.println("Card was not found in the magic hand!");
        }
    }

}
