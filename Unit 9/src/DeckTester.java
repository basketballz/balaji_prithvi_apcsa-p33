/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck DeckOne = new Deck(new String[] {"1", "3", "6"}, 
				new String[] {"spades", "hearts", "diamonds"}, 
				new int[] {1, 6, 7});
		System.out.println(DeckOne);
		DeckOne.shuffle();
		System.out.println(DeckOne);
		
		Deck DeckTwo = new Deck(new String[] {"Jack", "Queen", "King"},
				new String[] {"diamonds", "spades", "clubs"},
				new int[] {11, 12, 14});
		System.out.println(DeckTwo);
		DeckTwo.deal();
		System.out.println(DeckTwo);
		DeckTwo.shuffle();
		System.out.println(DeckTwo);
		int newone = DeckOne.size();
		for (int i = 0; i <newone ; i++) {
			DeckOne.deal();
		}
		System.out.println(DeckOne);
	}
}
