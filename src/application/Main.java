package application;

import exceptions.InvalidInputException;
import questions.Anagrams;
import questions.FibonacciSequence;
import questions.FizzBuzz;
import questions.IntegerReversal;
import questions.MaxChar;
import questions.PalindromeTest;
import questions.StringReversal;

public class Main {

	public static void main(String[] args) throws InvalidInputException {

		// STRING REVERSAL TESTS
		StringReversal.reverse("donato");

		// PALINDROME TESTS
		PalindromeTest.isPalindrome("ddassadd");
		PalindromeTest.isPalindrome("asdfgasdfasdf");
		PalindromeTest.isPalindrome2("donato");
		PalindromeTest.isPalindrome2("ddassadd");
		PalindromeTest.isPalindrome2("asdfgasdfasdf");

		System.out.println(IntegerReversal.reverseInt(981));
		System.out.println(IntegerReversal.reverseInt(500));
		System.out.println(IntegerReversal.reverseInt(-15));
		System.out.println(IntegerReversal.reverseInt(9801));

		System.out.println(MaxChar.find("2342ddssdsssssdd34gdfd"));
		// maxChar("abcccccccd") === "c"
		// maxChar("apple 1231111") === "1"

		FizzBuzz.fb(100);
		Anagrams.check("rail safety", "fairy tales");
		Anagrams.check("RAIL! SAFETY!", "fairy tales");
		Anagrams.check("Hi there", "Bye there");

		FibonacciSequence.printSequenceUpToNUsingLoop(60);

		FibonacciSequence.printNthFibNumer(10);
	}

}
