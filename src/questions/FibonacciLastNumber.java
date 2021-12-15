package questions;

public class FibonacciLastNumber {
	// Given a number n, print n-th Fibonacci Number.
	public static void printNthFibNumer(int n) {
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
