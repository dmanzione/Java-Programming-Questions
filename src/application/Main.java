package application;

import exceptions.InvalidInputException;
import questions.Palindrome;
import questions.StringReversal;

public class Main {

	public static void main(String[] args) throws InvalidInputException {

		System.out.println(StringReversal.reverse("donato"));
		
		System.out.println(Palindrome.isPalindrome("ddassadd"));
		System.out.println(Palindrome.isPalindrome("asdfgasdfasdf"));	
		System.out.println(Palindrome.isPalindrome2("donato"));
		System.out.println(Palindrome.isPalindrome2("ddassadd"));
		System.out.println(Palindrome.isPalindrome2("asdfgasdfasdf"));
	}
	

}
