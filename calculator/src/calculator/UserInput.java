package calculator;

import java.util.Scanner;

public class UserInput {

	public static void getingInput(String OType, int x) {

		try {
			Scanner Op = new Scanner(System.in);
			OType = Op.nextLine();

			System.out.println("Enter a number ");
			Scanner number = new Scanner(System.in);
			x = number.nextInt();

			if (OType == "DIVIDE" && x == 0)
				System.out.println("Unvalid number");
			System.out.println("Please enter another number");

			x = number.nextInt();
		} catch (ArithmeticException e) {
			System.out.println("Division by 0 is illegal  " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Not a legal argument  " + e.getMessage());
		}

	}

}
