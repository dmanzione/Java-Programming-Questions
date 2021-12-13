package questions;

import exceptions.InvalidInputException;

public class IntegerReversal {
	// --- Directions
	// Given an integer, return an integer that is the reverse
	// ordering of numbers.

	public static int reverseInt(int inputInteger) throws InvalidInputException {

		String intAsString = String.valueOf(inputInteger);

		String reversedInt = StringReversal.reverse(intAsString);

		// Make note if integer is negative by checking if there is a negative sign
		// character
		boolean isNegative = false;

		if (reversedInt.charAt(reversedInt.length() - 1) == '-') {
			isNegative = true;
		}

		// Remove leading zeroes by finding index at position to the right of last
		// leading index...

		int indexAtWhichToStartTransferring = 0;
		for (int i = 0; i < reversedInt.length(); i++) {
			if (reversedInt.charAt(i) != '0') {
				indexAtWhichToStartTransferring = i;
				break;
			}
		}

		// ... and then transferring all remaining characters except - to new String
		// variable
		String reversedIntNoLeadingZeroes = "";
		for (int i = indexAtWhichToStartTransferring; i < reversedInt.length(); i++) {
			if (reversedInt.charAt(i) != '-') {
				reversedIntNoLeadingZeroes += reversedInt.charAt(i);
			}
		}

		// If int was negative, add negative sign to beginning of String
		if (isNegative)
			reversedIntNoLeadingZeroes = "-" + reversedIntNoLeadingZeroes;

		// Convert String to Integer and return
		return Integer.valueOf(reversedIntNoLeadingZeroes);

	}

}
