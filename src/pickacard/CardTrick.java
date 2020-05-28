package pickacard;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Ye Eun Park May 28
 */
public class CardTrick
{

   public static void main (String[] args)
   {

      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();

         Random rnd = new Random();
         //c.setValue(insert call to random number generator here)
         c.setValue(rnd.nextInt(13) + 1);
         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
         c.setSuit(Card.SUITS[rnd.nextInt(4)]);
         magicHand[i] = c;
      }

      //insert code to ask the user for Card value and suit, create their card
      //Scanner src = new Scanner(System.in);
      //String userSuit;
      //int userValue;
      boolean isMatched = false;

      //System.out.println("Enter your card suit: Clubs, Hearts, Diamonds, Spades");
      //userSuit = src.nextLine();

      //System.out.println("Enter your card value");
      //userValue = src.nextInt();

       //add a (hard-coded) Card Object called luckyCard with a number and suit of your choosing
      Card luckyCard = new Card();
      luckyCard.setValue(7);
      luckyCard.setSuit("Hearts");
      
      // and search magicHand here
      for (int i = 0; i < magicHand.length; i++) {
         //if (magicHand[i].getSuit() == userSuit && magicHand[i].getValue() == userValue) {
         //   isMatched = true;
           if (magicHand[i].getSuit() == luckyCard.getSuit() && magicHand[i].getValue() == luckyCard.getValue()) {
              isMatched = true;
         }
      }
     
      //Then report the result here
      if (isMatched) {
         //System.out.println("Your card (" + userSuit + " " + userValue + ") is in the Magic Hand!");
           System.out.println("Congratualtions! You Won!!");
      }
      else {
         //System.out.println("Your card (" + userSuit + " " + userValue + ") is not in the Magic Hand!");
           System.out.println("Sorry, You lost..");
      }
   }
}
