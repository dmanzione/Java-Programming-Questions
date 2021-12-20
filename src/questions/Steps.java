package questions;

public class Steps {
	// --- Directions
	// Write a function that accepts a positive number N.
	// The function should console log a step shape
	// with N levels using the # character.  Make sure the
	// step has spaces on the right hand side!
	// --- Examples
	//   steps(2)
//	       '# '
//	       '##'
	//   steps(3)
//	       '#  '
//	       '## '
//	       '###'
	//   steps(4)
//	       '#   '
//	       '##  '
//	       '### '
//	       '####'
	
	public static void print(int n) {
		
		String level = "";
		for(int i = 0;i<n;i++) {
			level += "#";
			System.out.println(level);
		}
		
	}
}
