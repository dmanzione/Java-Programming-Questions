package application;

import exceptions.InvalidInputException;
import questions.IntegerReversal;
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

	}

}
