package objectsExample;

public interface Card extends Comparable<Card> {

	public enum Suit {
		DIAMONDS (1, "Diamonds"), CLUBS (2, "Clubs"), HEARTS (3, "Hearts"), SPADES (4, "Spades");
	
		private final int i;
		private final String name;
	
		Suit(int i, String name) {
			this.i = i;
			this.name = name;
		}
		public int value() {
			return i;
		}
	
		public String text() {
			return name;
		}
		
	}
	public Card.Suit getSuit();
	
}
