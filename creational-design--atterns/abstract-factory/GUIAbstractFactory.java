package abstract_Factory;

public class GUIAbstractFactory {
 public static IFactory createFActory(String s) {
	 if(s.equals("mac")) {
		 return new MacFactory();
	 }
	 else if(s.equals("wind")){
		 return new WinFactory();
	 }
     return new MacFactory();
 }
}
