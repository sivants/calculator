package calculator;

public class Multiply implements Operations {

	@Override
	public OperationType getType() {
	
		return OperationType.MULTIPLY;
	}

	@Override
	public int execute(int x, int y) {
		int result = x * y;
		return result;
	}

}
