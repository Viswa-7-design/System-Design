package decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Basepizza pizzaExtra=new Extracheese(new VegDelight());
		System.out.println(pizzaExtra.cost());
		
		Basepizza pizzaExtraMush=new Mushroom(new Extracheese(new Margjerita()));
		System.out.println(pizzaExtraMush.cost());
	}

}
