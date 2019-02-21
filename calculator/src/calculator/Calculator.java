package calculator;

import java.util.Scanner;

public class Calculator {
	
	private static int lastResult = 0;

	public int getLastResult() {
		return lastResult;
	}
	
	public static int performOperation(OperationType o, int a) {
	
		switch (o){
			case ADD:
				return (lastResult += a);
				
			case SUBTRUCT:
				return (lastResult -= a);
				
			case MULTIPLY:
				return (lastResult *= a);
				
			case DIVIDE:
				if (a != 0)
				return (lastResult /= a);
				else {
					System.out.println("Unvalid number");
					return lastResult;
				}
			case QUIT:
				return lastResult;
		
			default:
			System.out.println("Unvalid operation");
			return lastResult; 
			
		}
		
	}
	
	
	
	
	
	
	
	
	
}
