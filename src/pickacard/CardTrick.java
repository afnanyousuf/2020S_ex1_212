package pickacard;
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

      Card luckyCard = new Card();

      luckyCard.setValue(13);
      luckyCard.setSuit(Card.SUITS[3]);

      boolean tf = false;

      for (int i = 0; i < magicHand.length; i++) {
         if (luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit() == magicHand[i].getSuit()) {
            tf = true;
            System.out.println("You got the lucky card");
         }
      }
      if (tf == false) {
         System.out.println("Please try again");
      }
   }

}
