package Factory;

public class VehicleFactory {

	public static Vehicle getFactory(String s) {
		Vehicle v=null;
		if(s.equals("car")) {
			v=new Car();
		}
		else if(s.equals("bike")) {
			v= new Bike();
		}
		return v;
	}
}
