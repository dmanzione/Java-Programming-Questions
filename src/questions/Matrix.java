package questions;

public class Matrix {

	// --- Directions
	// Write a function that accepts an integer N
	// and returns a NxN spiral matrix.
	// --- Examples
	// matrix(2)
//	     [[1, 2],
//	     [4, 3]]
	// matrix(3)
//	     [[1, 2, 3],
//	     [8, 9, 4],
//	     [7, 6, 5]]
	// matrix(4)
//	     [[1,   2,  3, 4],
//	     [12, 13, 14, 5],
//	     [11, 16, 15, 6],
//	     [10,  9,  8, 7]]

	enum Direction {
		RIGHT, DOWN, LEFT, UP;

	}

	public static Direction direction = Direction.RIGHT;
	private static int[][] matrix;

	public static int[][] returnSpiral(int n) {
		if (n == 0) {
			return null;
		}

		matrix = new int[n][n];

		matrix[0][0] = 1;

		if (n == 1) {

			printMatrix();
			return matrix;

		}
		int[] currentPosition = { 0, 0 };
		int count = 1;

		while (count < n * n) {
//			System.out.println("Current position is " + currentPosition[0] + ", " + currentPosition[1]);
//			System.out.println("Moving " + direction.toString().toLowerCase());
			switch (direction) {

			case RIGHT:

				// If the next element is a number other than zero or you've reached the edge of
				// the matrix,
				// change direction. Otherwise, add next element.

				if (currentPosition[1] >= n - 1 || matrix[currentPosition[0]][currentPosition[1] + 1] != 0) {
					changeDirection();
					continue;
				} else {
					matrix[currentPosition[0]][++currentPosition[1]] = ++count;

				}

				break;
			case DOWN:

				// If the next element is a number other than zero or you've reached the edge of
				// the matrix,
				// change direction. Otherwise, add next element

				if (currentPosition[0] >= n - 1 || matrix[currentPosition[0] + 1][currentPosition[1]] != 0) {
					changeDirection();
					continue;
				} else {
					matrix[++currentPosition[0]][currentPosition[1]] = ++count;
				}
				break;

			case LEFT:

				// If the next element is a number other than zero or you've reached the edge of
				// the matrix,
				// change direction. Otherwise, add next element

				if (currentPosition[1] <= 0 || matrix[currentPosition[0]][currentPosition[1] - 1] != 0) {
					changeDirection();
					continue;
				} else {
					matrix[currentPosition[0]][--currentPosition[1]] = ++count;
				}
				break;
			case UP:
				// If the next element is a number other than zero or you've reached the edge of
				// the matrix,
				// change direction. Otherwise, add next element.

				if (currentPosition[0] <= 0 || matrix[currentPosition[0] - 1][currentPosition[1]] != 0) {
					changeDirection();
					continue;
				} else {
					matrix[--currentPosition[0]][currentPosition[1]] = ++count;
				}
				break;
			}

		}

		printMatrix();
		return matrix;

	}

	private static void printMatrix() {
		System.out.println("***********");
		for (int[] arr : matrix) {
			for (int i : arr)
				System.out.print(i + " ");
			System.out.println("");
		}

		System.out.println("***********\n\n");

	}

	private static void changeDirection() {
		switch (direction) {
		case RIGHT:
			direction = Direction.DOWN;
			break;
		case DOWN:
			direction = Direction.LEFT;
			break;
		case LEFT:
			direction = Direction.UP;
			break;
		case UP:
			direction = Direction.RIGHT;
			break;
		}

	}

}
