package objectsExample;

public class DeckOfCards {
	
	private PlayingCard card;

	 public static void main(String[] args) {
	
		 DeckOfCards d = new DeckOfCards();
		 
		 d.setCard(new PlayingCard(0, null));
		 d.getCard().setRank(1);
		 d.getCard().setSuit("black");
		 System.out.print("rank:" + d.getCard().getRank() + "; suit:" + d.getCard().getSuit());
	 }

	public PlayingCard getCard() {
		return card;
	}

	public void setCard(PlayingCard l) {
		this.card = l;
	}
}
