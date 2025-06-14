package builder;

public class Car {
	 private String engine;
     private int wheels;
     private int seats;
     private String color;
     private boolean sunroof;
     private boolean navigationSystem;
     private Car(CarBuilder builder) {
    	 this.engine=builder.engine;
    	 this.wheels=builder.wheels;
    	 this.color=builder.color;
    	 this.navigationSystem=builder.navigationSystem;
    	 this.seats=builder.seats;
    	 this.sunroof=builder.sunroof;
     }
	public String getEngine() {
		return engine;
	}
	public int getWheels() {
		return wheels;
	}
	public int getSeats() {
		return seats;
	}
	public String getColor() {
		return color;
	}
	public boolean isSunroof() {
		return sunroof;
	}
	public boolean isNavigationSystem() {
		return navigationSystem;
	}
     
    @Override
	public String toString() {
		return "Car [engine=" + engine + ", wheels=" + wheels + ", seats=" + seats + ", color=" + color + ", sunroof="
				+ sunroof + ", navigationSystem=" + navigationSystem + "]";
	}

	public static class CarBuilder{
    	 private String engine="yamaha";
         private int wheels=4;
         private int seats=5;
         private String color="black";
         private boolean sunroof=false;
         private boolean navigationSystem=false;
         
    

	public CarBuilder setEngine(String engine) {
		this.engine = engine;
		return this;
	}
	public CarBuilder setWheels(int wheels) {
		this.wheels = wheels;
		return this;
	}
	public CarBuilder setSeats(int seats) {
		this.seats = seats;
		return this;
	}
	public CarBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	public CarBuilder setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
		return this;
	}
	public CarBuilder setNavigationSystem(boolean navigationSystem) {
		this.navigationSystem = navigationSystem;
		return this;
	}
	public Car build() {
		return new Car(this);
	}
	
    }
}
