package prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
         Prototype p=new Prototype();
         Bean warrior=p.createCharcterwithNewName("Warrior");
         Bean mage=p.createCharcterwithNewlevel(10);
         Bean knight=p.createCharcterwithNewattackPower(100);
         
	}

}
