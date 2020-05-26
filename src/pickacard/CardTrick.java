package pickacard;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author James Hong May 26,2020
 */
public class CardTrick 
{

    public static void main(String[] args) 
    { 
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) 
        {
            Card c = new Card();
            
            c.setValue((int)(Math.random() * 2 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4 + 0)]);
            
            magicHand[i] = c;
        }
        
        /*for (int i = 0; i < magicHand.length; i++)
        {
           System.out.println("Card: " + magicHand[i].getValue());
           System.out.println("Suit: " + magicHand[i].getSuit());
        }
        */
        
        Card luckyCard = new Card();
        luckyCard.setValue = 13;
        luckyCard.setSuit = Card.SUITS["Spades"];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please pick a card value from 1-13");
        int cardValue = sc.nextInt();
        
        System.out.println("Please choose a suit 0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs");
        String cardSuit = Card.SUITS[sc.nextInt()];
        
        System.out.println(cardValue + " " + cardSuit);
        
        for (int i = 0; i < magicHand.length; i++)
        {
            if (cardValue != magicHand[i].getValue() || !cardSuit.equals(magicHand[i].getSuit())) 
            {
                continue;
            }
                System.out.println("You Did It!");
        }
    }
}
