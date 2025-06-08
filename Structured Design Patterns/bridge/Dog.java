package bridge;

public class Dog extends LivingThings{

	public Dog(BreatheImplementer breatheImplementer) {
		super(breatheImplementer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void breatheProcess() {
		// TODO Auto-generated method stub
		breatheImplementer.breathe();
	}

}
