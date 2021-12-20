package questions;

public class Vowels {
	// --- Directions
	// Write a function that returns the number of vowels
	// used in a string. Vowels are the characters 'a', 'e'
	// 'i', 'o', and 'u'.
	// --- Examples
	// vowels('Hi There!') --> 3
	// vowels('Why do you ask?') --> 4
	// vowels('Why?') --> 0
	// vowels('Ask Google!') --> 4
	public static int count(String str) {
		System.out.print("The number of vowels in \""+str+"\" is ");
		int numOfVowels = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				numOfVowels++;
			}
		}
		System.out.println(numOfVowels);
		return numOfVowels;
	}
}
