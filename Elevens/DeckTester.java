/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	
        public static void main(String[] args) {
          String[] rank = {"1","2","3","4","5"};
          String[] suit = {"clubs","hearts","diamonds","spades"};
          int[] values = {1,2,3,4,5};
          Deck d = new Deck(rank,suit,values);
          System.out.print(d);
	}
}
