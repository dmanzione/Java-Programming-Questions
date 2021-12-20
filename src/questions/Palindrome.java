package questions;

import exceptions.InvalidInputException;

public class Palindrome {
	// --- Directions
	// Given a string, return true if the string is a palindrome
	// or false if it is not. Palindromes are strings that
	// form the same word if it is reversed. *Do* include spaces
	// and punctuation in determining if the string is a palindrome.

	// First solution: compare each character to the character at the other side
	public static Boolean isPalindrome(String inputString) throws InvalidInputException {

		checkNotNull(inputString);

		// If size of string is 1
		if (inputString.length() == 1) {
			System.out.println(inputString + " is palindrome.");
			return true;
		}

		for (int i = 0; i < inputString.length() / 2; i++) {

			if (inputString.charAt(i) == inputString.charAt(inputString.length() - (i + 1)))
				continue;
			else {
				System.out.println(inputString + " is not palindrome.");
				return false;
			}
		}
		System.out.println(inputString + " is palindrome.");
		return true;

	}

	// Second solution: reverse string and compare
	public static Boolean isPalindrome2(String inputString) throws InvalidInputException {

		checkNotNull(inputString);

		// Reverse String
		String reversedString = StringReversal.reverse(inputString);

		return inputString.equals(reversedString);

	}

	private static void checkNotNull(Object input) throws InvalidInputException {
		if (input == null) {
			throw new InvalidInputException();
		}

	}
}
