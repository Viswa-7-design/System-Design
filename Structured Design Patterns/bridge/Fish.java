package bridge;

public class Fish extends LivingThings{

	public Fish(BreatheImplementer breatheImplementer) {
		super(breatheImplementer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void breatheProcess() {
		// TODO Auto-generated method stub
		breatheImplementer.breathe();
	}

}
