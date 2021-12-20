package questions;

import exceptions.InvalidInputException;

public class StringReversal {

	// Directions
	// Given a string, return a new string with the reversed order of characters

	public static String reverse(String originalString) throws InvalidInputException {
		String reversedString = "";

		if (originalString == null) {
			throw new InvalidInputException();
		}
		for (int i = originalString.length() - 1; i >= 0; i--) {
			reversedString += originalString.charAt(i);
		}

		return reversedString;

	}
}
