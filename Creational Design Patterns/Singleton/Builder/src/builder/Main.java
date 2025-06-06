package builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Car.CarBuilder builder=new Car.CarBuilder();
      Car car1=new Car.CarBuilder().setEngine("v8").setColor("red").setSeats(5).setSunroof(true).build();
      System.out.println(car1);
      Car car2=new Car.CarBuilder().setColor("Blue").setSeats(4).build();
      System.out.println(car2);
	}

}
