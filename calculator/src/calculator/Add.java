package calculator;

public class Add implements Operations{

	@Override
	public int execute(int x, int y) {
		int result = x + y;
		return result;
	}

	@Override
	public OperationType getType() {
		
		return OperationType.ADD;
	}
	
}	

	
