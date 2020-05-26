package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 *
 * @author Alessandra Aprea May 26, 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
//        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13 - 1 + 1) + 1);
//            System.out.println(c.getValue());
            
            c.setSuit(Card.SUITS[random.nextInt(4)]);
//            System.out.println(c.getSuit());
            
            magicHand[i] = c;
        }

//         System.out.println("\n" + "Choose a Card value and a suit:");
       
        Card luckyCard = new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit("Hearts");
        
        int cardValue = luckyCard.getValue();
        String cardSuit = luckyCard.getSuit();
        
        for(int i = 0; i < magicHand.length; i++){
            
            if(magicHand[i].getValue() == cardValue && magicHand[i].getSuit().equals(cardSuit)){
                System.out.println("\n" + "Congratulations you win!");
                System.exit(0);
            }
             
        }
        
        System.out.println("\n" + "I'm sorry your lucky card is not in the deck of cards");

    }

}
