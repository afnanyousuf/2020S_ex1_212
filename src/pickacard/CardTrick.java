package pickacard;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 *
 * @author Haydyn Barreto May 26, 2020
 */
public class CardTrick
{

   public static void main (String[] args)
   {

      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         //c.setValue(insert call to random number generator here)
         c.setValue((int) (Math.random() * 2 + 1));
         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
         c.setSuit(Card.SUITS[(int) (Math.random() * 4 + 0)]);

         magicHand[i] = c;
      }

//      for (int i = 0; i < magicHand.length; i++) {
//         System.out.println("Card: " + magicHand[i].getValue());
//         System.out.println("Suit: " + magicHand[i].getSuit());
//      }

      //insert code to ask the user for Card value and suit, create their card
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter your card value(1-13): ");
      int cardValue = scan.nextInt();

      System.out.println("Please choose a suit Hearts = 0, Diamonds = 1, Spades = 2, Clubs = 3");
      String cardSuit = Card.SUITS[scan.nextInt()];

      System.out.println(cardValue + " " + cardSuit);

      // and search magicHand here
      //Then report the result here

      for (int i = 0; i < magicHand.length; i++) {
         if (cardValue != magicHand[i].getValue() && !cardSuit.equals(magicHand[i].getSuit())) {
            break;
         }
      }
      System.out.println("You Did It!");
   }

}
