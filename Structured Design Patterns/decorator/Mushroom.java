package decorator;

public class Mushroom extends ToppingDecorator{

	Basepizza basepizza;
	
	public Mushroom(Basepizza basepizza) {
		super();
		this.basepizza = basepizza;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.basepizza.cost()+15;
	}

}
