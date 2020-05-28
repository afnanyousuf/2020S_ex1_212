package pickacard;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Mudit Sharma 27/05/2020
 * @author dancye
 * @author Paul Bonenfant
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);

       //To create a magic hand
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            int randomSuit = (int)(Math.random() * ((3 - 0) + 1)) + 0;
            int randomNum =  (int)(Math.random() * ((13 - 1) + 1)) + 1;
            c.setSuit(Card.SUITS[randomSuit]);
            c.setValue(randomNum);
            magicHand[i] = c;
          }
        
        //Taking user input
        Card userCard = new Card();
        System.out.println("Enter a suit: ");
        userCard.setSuit(input.next());
        System.out.println("Enter the value: ");
        userCard.setValue(input.nextInt());
        
        String result = "Entered card is not in the magic hand";
        
        //Checking if the user entered card is in the magic hand
        for (int i = 0; i < 7; i++) {
            Card tempCard = magicHand[i];
            if(userCard.getSuit().equals(tempCard.getSuit()) && userCard.getValue() == tempCard.getValue())
                result = "Entered card is in the magic hand";
        }
        
        //reporting the result of the check
        System.out.println(result);

    }

}
