package Singleton;

public class Synchrons {
	private static Synchrons instance;
	  private Synchrons() {
		  
	  }
	  synchronized public static Synchrons getInstance() {
		  if(instance==null) {
			  instance=new Synchrons();
		  }
		  return instance;
	  }
	  public void getFun() {
		  System.out.println("Synchrons Singleton Class");
	  }
}
