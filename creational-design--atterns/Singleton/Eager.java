package Singleton;

public class Eager {
  private static Eager instance=new Eager();
  private Eager() {
	  
  }
  public static Eager getInstance() {
	  return instance;
  }
  public void getFun() {
	  System.out.println("Eager Singleton Class");
  }
}
