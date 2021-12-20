package questions;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

	public static boolean check(String firstWord, String secondWord) {
		// Directions:
		// Check to see if two provided strings are anagrams of each other.
		// One string is an anagram of another if it uses the same characters
		// in the same quantity.

		Map<Character, Integer> firstWordCharFreq = new HashMap<>();
		Map<Character, Integer> secondWordCharFreq = new HashMap<>();

		char[] firstWordAsCharArr = firstWord.toCharArray();
		char[] secondWordAsCharArr = secondWord.toCharArray();

		for (char c : firstWordAsCharArr) {
			char character = Character.toLowerCase(c);
			if (!Character.isLetterOrDigit(character)) {
				continue;
			}
			if (firstWordCharFreq.containsKey(character)) {
				int repeatedTimes = firstWordCharFreq.get(character) + 1;
				firstWordCharFreq.put(character, repeatedTimes);
			} else {
				firstWordCharFreq.put(character, 1);
			}
		}

		for (char c : secondWordAsCharArr) {
			char character = Character.toLowerCase(c);
			if (!Character.isLetterOrDigit(character)) {
				continue;
			}
			if (secondWordCharFreq.containsKey(character)) {
				int repeatedTimes = secondWordCharFreq.get(character) + 1;
				secondWordCharFreq.put(character, repeatedTimes);
			} else {
				secondWordCharFreq.put(character, 1);
			}
		}

		boolean areAnagrams = firstWordCharFreq.equals(secondWordCharFreq);
		if (areAnagrams)
			System.out.println("\"" + firstWord + "\" is anagram of \"" + secondWord + "\"");
		else
			System.out.println("\"" + firstWord + "\" is not anagram of \"" + secondWord + "\"");

		return areAnagrams;
	}
}
