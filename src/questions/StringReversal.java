package questions;

public class StringReversal {

	// Directions
	// Given a string, return a new string with the reversed order of characters

	String reversedString = "";

	public String reverse(String originalString) {
		for (int i = originalString.length() - 1; i >= 0; i--) {
			reversedString += originalString.charAt(i);
		}

		return reversedString;

	}
}
