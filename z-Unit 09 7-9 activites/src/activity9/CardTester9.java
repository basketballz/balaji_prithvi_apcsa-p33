package activity9;
//prith
/**
 * This is a class that tests the Card class.
 */
public class CardTester9 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card9 Spade = new Card9("Ace", "Spades", 1);
		
		System.out.println(Spade);
		
		Card9 Diamonds = new Card9("Ace", "Diamonds", 1);
		
		System.out.println(Diamonds);
		
		Card9 Spade1 = new Card9("Ace", "Spades", 2);
		
		System.out.println(Spade1);
	}
}