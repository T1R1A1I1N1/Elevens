/**
 * This is a class that tests the Card class.
 */
public class CardTester {
        
	
	public static void main(String[] args) {
	  Card a,b,c;
	  a = new Card("5","clubs",4);
	  b = new Card("5","clubs",4);
	  c = new Card("6","hearts",14);
	  System.out.print(a.rank());
	  System.out.print(a.suit());
	  System.out.print(a.pointValue());
	  System.out.print(a);
	  System.out.print(a.matches(b));
	  System.out.print(a.matches(c));
	}
}
