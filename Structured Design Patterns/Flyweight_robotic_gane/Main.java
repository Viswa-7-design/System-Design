package robotic_gane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IRobot humanidrobot1=RoboticFactory.createRobot("human");
		humanidrobot1.display(1, 2);
		
		IRobot humanidrobot2=RoboticFactory.createRobot("human");
		humanidrobot2.display(3, 2);
		
		IRobot robodog1=RoboticFactory.createRobot("robot");
		robodog1.display(10, 20);
		
		IRobot robodog2=RoboticFactory.createRobot("robot");
		robodog2.display(90, 2);
		
	}

}
