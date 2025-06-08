package bridge;

public class Tree extends LivingThings{

	public Tree(BreatheImplementer breatheImplementer) {
		super(breatheImplementer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void breatheProcess() {
		// TODO Auto-generated method stub
		breatheImplementer.breathe();
	}

}
