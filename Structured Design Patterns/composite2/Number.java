package composite2;

public class Number implements ArithmaticExpression{
    int num;
    
	public Number(int num) {
		super();
		this.num = num;
	}

	@Override
	public int slove() {
		// TODO Auto-generated method stub
		return num;
	}

}
