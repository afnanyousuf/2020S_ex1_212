package pickacard;
import java.util.Scanner; //Scanner Class tO read Input

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Jason D'Souza
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            c.setValue((int)(Math.random()*13)+1);
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;
            System.out.printf("%d %s \n", c.getValue(), c.getSuit());
        }

        /*Scanner in =new Scanner(System.in);
        System.out.println("Enter a suit (clubs, spades, hearts, diamonds)");
        String suit = in.nextLine();
        suit = (suit.substring(0, 1).toUpperCase()+suit.substring(1).toLowerCase());
        System.out.println("Enter a Number (1-13)");
        int value = in.nextInt();*/
        
        Card luckyCard = newCard();
        luckyCard.setValue(7);
        luckyCard.setSuit(Card.SUITS[1])
        String suit = luckyCard.getSuit();
        int value = luckyCard.getValue();
        
        for (int j = 0; j < magicHand.length; j++){
            if(suit.equals(magicHand[j].getSuit())){
                if(value==magicHand[j].getValue()){
                    System.out.println("Card is in the Magic Hand.");
                    break;
                }
            }
            else if (magicHand.length-1 == j){
                System.out.println("Card is not in Magic Hand");
            }
            else{}
            
        }
        
    }

}
