package questions;

public class FibonacciSequence {

	// Print all elements in fibonacci sequence until n
	public static void printSequenceUpToNUsingLoop(int n) {

		if (n < 0) {
			System.out.println("Invalid input (negative number).");
			return;
		}

		if (n <= 1) {
			System.out.println("{" + n + "}");
			return;
		}

		String fibSequence = "";

		int currentElement = 1;
		int previousElement = 1;

		fibSequence += previousElement + " " + currentElement;

		fibSequence = previousElement + " ";
		while (currentElement <= n) {
			fibSequence += currentElement + " ";
			int temp = currentElement;
			currentElement = currentElement + previousElement;
			previousElement = temp;
		}
		System.out.println("Fib sequence: " + fibSequence);
	}

	public static void printSequenceUpToNUsingRecursion(int n) {

	}

	// Given a number n, print n-th Fibonacci Number.
	public static void printNthFibNumber(int n) {
		int previousFib = 1;
		int currentFib = 1;

		for (int i = 2; i < n; i++) {
			int temp = currentFib;
			currentFib = currentFib + previousFib;
			previousFib = temp;
		}

		System.out.println(currentFib);
	}
}
