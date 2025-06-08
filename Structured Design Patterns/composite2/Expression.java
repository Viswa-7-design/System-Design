package composite2;

public class Expression implements ArithmaticExpression{
	 ArithmaticExpression left;
     ArithmaticExpression right;
	Operation operation;
	public Expression(ArithmaticExpression left, ArithmaticExpression right, Operation operation) {
		super();
		this.left = left;
		this.right = right;
		this.operation = operation;
	}
	@Override
	public int slove() {
		int va=0;
		switch(operation) {
		case ADD:
			va=left.slove()+right.slove();
			break;
		case SUB:
			va=left.slove()-right.slove();
			break;
		case MUL:
			va=left.slove()*right.slove();
			break;
		case DIV:
			va=left.slove()/right.slove();
			break;
		}
		System.out.println(va);
		return va;
	}
	
	

}
