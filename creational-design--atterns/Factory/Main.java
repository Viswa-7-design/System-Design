package Factory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          String s=sc.next();
          Vehicle obj=VehicleFactory.getFactory(s);
          obj.createVehicle();
	}

}
