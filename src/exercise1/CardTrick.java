package exercise1;
import java.util.*;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Dwiti Patel Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card(); //new card
            int j = (int) (1+ (Math.random() * 13));
            card.setValue(j);
            int k = (int) (Math.random() * 4);
            card.setSuit(Card.SUITS[k]);
            String s1 = card.getSuit();
            System.out.println(card.getValue()+" of "+card.getSuit());
            hand[i]=new Card(j,s1);

        }
        System.out.println("Please choose the suits \n Hearts \n Diamonds \n Spades \n Clubs");
        String a = input.next();
 
        
        System.out.println("Enter the value from 1 to 13");
        int b = input.nextInt();
        
        for(int i=0;i<hand.length;i++){
            if(b == hand[i].getValue() && a.equalsIgnoreCase(hand[i].getSuit()))
              System.out.println("Congratulations, you guessed right!");

        }
        
        
    }
	System.out.println("My name is Dwiti");
        System.out.println("My career ambitions:-- Have a semester with no violations of academic integrity!");
        System.out.println("My hobbies:-- Cooking");

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println("My name is Dwiti");
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
