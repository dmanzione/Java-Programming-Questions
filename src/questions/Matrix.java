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
		
		if (n == 1) {

			matrix[0][0] = 1;
			printMatrix();
			return matrix;

		}
		int[] currentPosition = { 0, 0 };
		int count = 1;
		int numOfElements = n * n;

		for (int j = 0; j < n * n; j++) {

			if (direction == Direction.RIGHT) {

				int numOfOperationsToTheRight = n - currentPosition[1];
				for (int i = currentPosition[1]; i < numOfOperationsToTheRight; i++) {
					System.out.println("Current Position is: " + currentPosition[0] + ", " + currentPosition[1]);

					matrix[currentPosition[0]][i] = count;
					count++;
					currentPosition[1] = i;

				}
				changeDirection();
			} else if (direction == Direction.DOWN) {
				System.out.println("Im here");
				int numOfOperationsDown = n - currentPosition[0];
				System.out.println("Current Position is: " + currentPosition[0] + ", " + currentPosition[1]);
				for (int i = currentPosition[0]; i < numOfOperationsDown; i++) {
					
					
					currentPosition[0] = i;
					matrix[i][currentPosition[1]] = count;
					count++;
				}
				changeDirection();
				

			}
			else if (direction == Direction.LEFT) {
				
				int numOfOperationsDown = n - currentPosition[0];
				System.out.println("Current Position is: " + currentPosition[0] + ", " + currentPosition[1]);
				for (int i = currentPosition[0]; i < numOfOperationsDown; i++) {
					
					
					currentPosition[0] = i;
					matrix[i][currentPosition[1]] = count;
					count++;
				}
				changeDirection();
				

			}
//			case UP:
//				
//				
//				break;
//			}

		}

//		for (int i = 0; i < n; i++) {
//			matrix[0][i] = count + 1;
//			printMatrix();
//			count++;
//		}
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
