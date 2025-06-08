package robotic_gane;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {

	private static Map<String,IRobot> roboticobj=new HashMap<>();
	public static IRobot createRobot(String robotType) {
		if(roboticobj.containsKey(robotType)) {
			return roboticobj.get(robotType);
		}
		else {
			if(robotType.equals("HUMAN")) {
				Sprites humanobj=new Sprites();
				IRobot humanidobj=new HumanoidRobot(robotType, humanobj);
				roboticobj.put(robotType, humanidobj);
				return humanidobj;
			}
			else if(robotType.equals("robot")) {
				Sprites roboticobj1=new Sprites();
				IRobot roboticidobj=new HumanoidRobot(robotType, roboticobj1);
				roboticobj.put(robotType, roboticidobj);
				return roboticidobj;
			}
		}
		return null;
	}
	
}
