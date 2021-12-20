package utilities;

import exceptions.InvalidInputException;

public class Utilities {

	public static void testNotNull(Object input) throws InvalidInputException {
		if (input == null)
			throw new InvalidInputException();
	}
}
