package bridge;

public abstract class LivingThings {
	
	BreatheImplementer breatheImplementer;

	public LivingThings(BreatheImplementer breatheImplementer) {
		//super();
		this.breatheImplementer = breatheImplementer;
	}
	abstract public void breatheProcess();

}
