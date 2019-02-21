package calculator;

public class Divide implements Operations {

	@Override
	public OperationType getType() {
		
		return OperationType.DIVIDE;
	}

	@Override
	public int execute(int x, int y) {
		int result = x / y;
		return result;
	}

}
