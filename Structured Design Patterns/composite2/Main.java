package composite2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmaticExpression one=new Number(1);
		ArithmaticExpression four=new Number(4);
		ArithmaticExpression nine=new Number(9);
		Expression add=new Expression(four, nine, Operation.ADD);
		Expression sub=new Expression(one, add, Operation.SUB);
		sub.slove();

	}

}
