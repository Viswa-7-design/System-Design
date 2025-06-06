package Singleton;

public class Lazy {
	private static Lazy instance;
	  private Lazy() {
		  
	  }
	  public static Lazy getInstance() {
		  if(instance==null) {
			  instance=new Lazy();
		  }
		  return instance;
	  }
	  public void getFun() {
		  System.out.println("Lazy Singleton Class");
	  }
}
