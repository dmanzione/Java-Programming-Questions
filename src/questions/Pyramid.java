package questions;

public class Pyramid {
	// --- Directions
	// Write a function that accepts a positive number N.
	// The function should console log a pyramid shape
	// with N levels using the # character. Make sure the
	// pyramid has spaces on both the left *and* right hand sides
	// --- Examples
	// pyramid(1)
//	       '#'
	// pyramid(2)
//	       ' # '
//	       '###'
	// pyramid(3)
//	       '  #  '
//	       ' ### '
//	       '#####'

	public static void make(int n) {
		if (n <= 0)
			return;

		String whiteSide = "";

		for (int i = 0; i < n; i++) {

			whiteSide += " ";

		}
		String pyramid = "#";
		
		
		System.out.println("\t\tPYRAMID WITH " + n + " LEVELS:\n\n "+whiteSide + pyramid + whiteSide);

		
		for (int i = 1; i < n; i++) {
			pyramid += "##";
			System.out.println(whiteSide + pyramid + whiteSide);
			whiteSide = whiteSide.substring(1, whiteSide.length());
		}
	}
}
