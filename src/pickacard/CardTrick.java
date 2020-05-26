package pickacard;
import java.util.Scanner;
        
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Moon Hyuk Kang
 * 
 * Date: May 26, 2020
 */
public class CardTrick { // Start of CardTrick class
    
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) { // Start of main method
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) { // Start of for loop
            
            Card c = new Card();
            
            // Assigning value to Card object
            c.setValue((int)(Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4+0)]);
            
            // Assigning card object 
            magicHand[i] = c;
            
        } // End of for loop
        
//        for (int i = 0; i < magicHand.length; i++) {
//            System.out.println("Value: " + magicHand[i].getValue());
//            System.out.println("Suit: " + magicHand[i].getSuit());
//        }
        
        // Asking user for their guess
        System.out.println("Guess a card");
        System.out.println("Enter a card value");
        System.out.println("Ace = 1, Jack =11, Queen =12, King = 13");
        System.out.print("Value: ");
        int value = sc.nextInt();
        
        System.out.println("Enter a suit");
        System.out.println("0 for Hearts, 1 for Diamonds, 2 for Spades, 3 for Clubs");
        System.out.print("Suit: ");
        String suit = Card.SUITS[sc.nextInt()];
        
        // Displaying user's choice
        System.out.println("You have guessed " + value + " of " + suit);
        
        // Variable that will hold how many times the user's guess has appeared in the 7 cards
        int counter = 0;
        
        for (int i = 0; i < magicHand.length; i++) { // Start of for loop
            if (value == magicHand[i].getValue() && suit.equals(magicHand[i].getSuit())) {
                counter++;
            }
        } // End of for loop
        
        System.out.println("Out of 7 cards, your guess has appeared " + counter + " time(s).");
        
    }

}
