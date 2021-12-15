package questions;

public class FibonacciSequence {

	//Print all elements in fibonacci sequence until n
	public static void printUsingLoop(int n) {

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

	public static void printUsingRecursion(int n) {

	}
}
