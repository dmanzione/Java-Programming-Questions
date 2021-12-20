package questions;

import exceptions.InvalidInputException;
import utilities.Utilities;

public class SentenceCapitalization {
	// --- Directions
	// Write a function that accepts a string. The function should
	// capitalize the first letter of each word in the string then
	// return the capitalized string.
	// --- Examples
	// capitalize('a short sentence') --> 'A Short Sentence'
	// capitalize('a lazy fox') --> 'A Lazy Fox'
	// capitalize('look, it is working!') --> 'Look, It Is Working!'

	public static String capitalize(String inputString) throws InvalidInputException {

		Utilities.testNotNull(inputString);

		String[] words = inputString.split(" ");
		String returnString = "";
		for (int i = 0; i < words.length; i++) {
			String newWord = "";
			if (words[i].length() > 1)
				newWord = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
			else if (words[i].length() > 0)
				newWord = words[i].substring(0, 1).toUpperCase();

			returnString += newWord;
			if (i < words.length - 1) {
				returnString += " ";
			}

		}

		System.out.println(inputString + " capitalized is " + returnString);
		return returnString;

	}

}
