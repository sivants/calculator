package calculator;

import java.util.Scanner;
import java.util.Random;
import java.io.Serializable;
import java.util.IllegalFormatException;;

public class UserCalculator {

	public static void main(String[] args) {

		Calculator calculator = new Calculator(); // is it necessary?

		Serializable OType = null;
		int x = 0;

		do {
			System.out.println("Please enter an operation: ADD / SUBTRUCT / MULTIPLY / DIVIDE / QUIT");

			UserInput.getingInput((String) OType, x);

			Calculator.performOperation((OperationType) OType, x);
		}

		while (OType != "QUIT");

		int range = 0;
		System.out.println("For a random argument, please enter: 'rand' and a number to indicate the range ");

		try {
			Scanner Random = new Scanner(System.in);
			OType = Random.nextLine();

			Scanner number = new Scanner(System.in);
			range = number.nextInt();

			if (OType != "RANDOM")
				System.out.println("Only the Random operation is available");
		}

		catch (NumberFormatException e) {
			System.out.println("Not a valid number " + e.getMessage());
		}

		Random random = new Random();

		int n = random.nextInt(2 * range + 1) - range;

		System.out.println("Please choose an operation: ADD/ SUBTRUCT/ MULTIPLY/ DIVIDE");
		UserInput.getingInput((String) OType, x);
		Calculator.performOperation((OperationType) OType, n);

	}

}/*Hi Ameed, I really hope at least part of this is ok. 
It took me a-l-o-t of time and reedditing to do this.
 I supose there will be corrections to make     */ 




