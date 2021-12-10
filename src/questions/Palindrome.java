package questions;

import exceptions.InvalidInputException;

public class Palindrome {
	// --- Directions
	// Given a string, return true if the string is a palindrome
	// or false if it is not. Palindromes are strings that
	// form the same word if it is reversed. *Do* include spaces
	// and punctuation in determining if the string is a palindrome.

	public static Boolean isPalindrome(String inputString) throws InvalidInputException {
		if (inputString == null) {
			throw new InvalidInputException();
		}

		// If size of string is 1
		if (inputString.length() == 1) {

			return true;
		}

		for (int i = 0; i < inputString.length() / 2; i++) {

			if (inputString.charAt(i) == inputString.charAt(inputString.length() - (i + 1)))
				continue;
			else
				return false;
		}
		return true;

	}
}
