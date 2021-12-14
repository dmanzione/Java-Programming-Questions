package questions;

import java.util.HashMap;
import java.util.Map;

public class MaxChar {

	// --- Directions
	// Given a string, return the character that is most
	// commonly used in the string.
	// --- Examples
	// maxChar("abcccccccd") === "c"
	// maxChar("apple 1231111") === "1"

	public static char find(String s) {

		// Create variables for the character we are looking for (the
		// one most repeated) and the number of times if has been repeated
		Integer greatestFrequency = 0;
		Character mostRepeatedCharacter = null;

		// Store the number of times each character is used
		// by creating a map where the keys are the characters,
		// and the values are the number of times the characters are used
		Map<Character, Integer> freq = new HashMap<Character, Integer>();

		// iterate through each character in the string
		for (int i = 0; i < s.length(); i++) {

			Character currentCharacter = s.charAt(i);

			// if the current character is not yet in our map, add it
			// and give it a frequency of 1 (since so far it has only
			// appeared once in the string)
			if (!freq.containsKey(currentCharacter)) {
				freq.put(currentCharacter, 1);
				continue;
			}
			// if current character is already in our map...

			// calculate the number of times the character has been
			// repeated by increasing the frequency stored in map
			// by 1
			Integer timesRepeated = freq.get(s.charAt(i)) + 1;

			// replace old freq value with new one
			freq.put(currentCharacter, timesRepeated);

			/// Now that we have stored how many times the character
			// has been repeated, check if the frequency of the
			// character exceeds that of any other character in
			// the string so far
			if (timesRepeated > greatestFrequency) {
				greatestFrequency = timesRepeated;
				mostRepeatedCharacter = currentCharacter;
			}

		}

		System.out.println(freq);

		System.out.print("Most repeated character is: ");

		return mostRepeatedCharacter;
	}
}
