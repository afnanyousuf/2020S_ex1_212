package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Yuri Doubas
 * 
 * May 26 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        //create array of seven card objects
        Card[] magicHand = new Card[7];
        

        //for each card in array, assign a random value and suit
        for (int i = 0; i < magicHand.length; i++) {
            //create card object
            Card c = new Card(); 
            
            //assign random value
            c.setValue((int)(Math.random() * 13) + 1); 
            
            //assign random suit
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
            //place Card c into magicHand array
            magicHand[i] = c; 
            
            //System.out.println(c.getValue() + " of " + c.getSuit());
        }
        
        //create scanner object to grab user input
        Scanner input = new Scanner(System.in);
        
        Card userCard = new Card();
        
        System.out.println("Pick a card:");
        System.out.println("Ace = 1, Jack = 11, Queen = 12, King = 13");
        System.out.print("Card Value:");
        //int value = input.nextInt();
        userCard.setValue(input.nextInt());
        
        System.out.println("Hearts = 0, Diamonds = 1, Spades = 2, Clubs = 3");
        System.out.print("Card Suit:");
        //String suit = Card.SUITS[input.nextInt()];
        userCard.setSuit(Card.SUITS[input.nextInt()]);
        
        boolean found = false;
        //iterate through magicHand and check if the user's card matches and card in the hand
        for (int i = 0; i < magicHand.length; i++) {
            if (userCard.getValue() == magicHand[i].getValue() && userCard.getSuit().equals(magicHand[i].getSuit())) {
                System.out.println("Card found in the magic hand!");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Card was not found in the magic hand!");
        }
        
    }
}
