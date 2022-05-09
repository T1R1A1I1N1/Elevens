/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

    private String suit;
    private String rank;
    private int pointValue;

    public Card(String rank, String suit, int pointValue) {
        this.suit = suit;
        this.rank = rank;
        this.pointValue = pointValue;
    }

    public String suit() {
        return suit;   
    }

    public String rank() {
        return rank;    
    }

    public int pointValue() {
        return pointValue;
    }

    public boolean matches(Card c) {
        return (c.suit() == suit && c.rank() == rank && c.pointValue() == pointValue);
    }

    @Override
    public String toString() {
        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }
}
