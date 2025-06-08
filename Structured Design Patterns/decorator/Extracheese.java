package decorator;

public class Extracheese extends ToppingDecorator{

	Basepizza basepizza;
	
	public Extracheese(Basepizza basepizza) {
		super();
		this.basepizza = basepizza;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.basepizza.cost()+10;
	}

}
