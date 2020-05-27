package pickacard;

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
        
        Card luckyCard = new Card();
        luckyCard.setValue(4);
        luckyCard.setSuit(Card.SUITS[0]);
     
        boolean found = false;
        //iterate through magicHand and check if the user's card matches and card in the hand
        for (int i = 0; i < magicHand.length; i++) {
            if (luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equals(magicHand[i].getSuit())) {
                System.out.println("Card was found in the magic hand!");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Card was not found in the magic hand!");
        }
        
    }
}
