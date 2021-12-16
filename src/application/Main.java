package application;

import exceptions.InvalidInputException;
import questions.FibonacciSequence;
import questions.FizzBuzz;
import questions.IntegerProblems;
import questions.StringProblems;

public class Main {

	public static void main(String[] args) throws InvalidInputException {

		

		// STRING PROBLEMS
		
		// reverse string
		StringProblems.reverse("donato");
		
		// check if string is palindrome
		StringProblems.isPalindrome("ddassadd");
		StringProblems.isPalindrome("asdfgasdfasdf");
		StringProblems.isPalindrome2("donato");
		StringProblems.isPalindrome2("ddassadd");
		StringProblems.isPalindrome2("asdfgasdfasdf");
	
		// return most repeated character in string
		StringProblems.maxChar("2342ddssdsssssdd34gdfd");
		
		// check if two strings are anagrams of each other
		StringProblems.areAnagrams("rail safety", "fairy tales");
		StringProblems.areAnagrams("RAIL! SAFETY!", "fairy tales");
		StringProblems.areAnagrams("Hi there", "Bye there");

		StringProblems.hasUniqueCharacters("asdfghjkl");
		StringProblems.hasUniqueCharacters("asdfgas");
		
		IntegerProblems.reverseInt(981);
		IntegerProblems.reverseInt(500);
		IntegerProblems.reverseInt(-15);
		IntegerProblems.reverseInt(9801);

		
		FibonacciSequence.printSequenceUpToNUsingLoop(60);

		FibonacciSequence.printNthFibNumber(10);

		FizzBuzz.fb(100);

		
	}

}
