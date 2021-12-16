package questions;

import java.util.HashMap;
import java.util.Map;

import exceptions.InvalidInputException;

public class StringProblems {

	

	public static String reverse(String originalString) throws InvalidInputException {
		// Given a string, return a new string with the reversed order of characters
		String reversedString = "";

		if (originalString == null) {
			throw new InvalidInputException();
		}
		for (int i = originalString.length() - 1; i >= 0; i--) {
			reversedString += originalString.charAt(i);
		}

		return reversedString;

	}

	public static Boolean isPalindrome(String inputString) throws InvalidInputException {
		// Given a string, return true if the string is a palindrome
		// or false if it is not. Palindromes are strings that
		// form the same word if it is reversed. *Do* include spaces
		// and punctuation in determining if the string is a palindrome.

		// First solution palindrome: compare each character to the character at the
		// other side

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

	public static Boolean isPalindrome2(String inputString) throws InvalidInputException {
		// Given a string, return true if the string is a palindrome
		// or false if it is not. Palindromes are strings that
		// form the same word if it is reversed. *Do* include spaces
		// and punctuation in determining if the string is a palindrome.

		// Second palindrome solution: reverse string and compare
		checkNotNull(inputString);

		// reverse string
		String reversedString = reverse(inputString);

		return inputString.equals(reversedString);

	}

	public static char maxChar(String s) {
		// Directions:
		// Given a string, return the character that is most
		// commonly used in the string.
		// --- Examples
		// maxChar("abcccccccd") === "c"
		// maxChar("apple 1231111") === "1"

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

		System.out.println("Times each character is repeated in " + s + ":\n\t" + freq);

		System.out.println("Most repeated character in " + s + " is: " + mostRepeatedCharacter);

		return mostRepeatedCharacter;
	}

	public static boolean areAnagrams(String firstWord, String secondWord) {
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

	private static void checkNotNull(Object input) throws InvalidInputException {
		if (input == null) {
			throw new InvalidInputException();
		}

	}
}
