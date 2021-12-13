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
		Map<Character, Integer> freq = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (freq.containsKey(s.charAt(i))) {
				freq.put(s.charAt(i), freq.get(s.charAt(i)) + 1);

			} else {
				freq.put(s.charAt(i), 1);
			}
		}

		Integer greatestFrequency = 0;
		Character mostRepeatedCharacter = null;

		System.out.println(freq);
		for (Map.Entry<Character, Integer> entry : freq.entrySet()) {

			Character character = entry.getKey();
			Integer numOfTimesCharacterRepeats = entry.getValue();

			if (numOfTimesCharacterRepeats > greatestFrequency) {
				greatestFrequency = numOfTimesCharacterRepeats;
				mostRepeatedCharacter = character;
			}
		}
		System.out.print("Most repeated character is: ");

		return mostRepeatedCharacter;
	}
}
