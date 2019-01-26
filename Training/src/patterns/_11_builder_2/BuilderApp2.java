package patterns._11_builder_2;

public class BuilderApp2 {

	public static void main(String[] args) {
		CarBuilder carBuilder=new CarBuilder();
		carBuilder.buildMaxSpeed(300);
		System.out.println(carBuilder.build());
		
		Car car=new CarBuilder()
				.buildMaxSpeed(90)
				.build();
		System.out.println(car);
	}

}
enum Transmission{
	MANUAL, AUTO
}

class Car{
	private String model;
	private Transmission transmission;
	private int maxSpeed;
	
	@Override
	public String toString() {
		return "=====  model=" + model + "\n=====  transmission=" + transmission + "\n=====  maxSpeed=" + maxSpeed;
	}
	public void setModel(String make) {this.model = make;}
	public void setTransmission(Transmission transmission) {this.transmission = transmission;}
	public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}
	
}

class CarBuilder{
	
	private String model="Default";
	private Transmission transmission=Transmission.MANUAL;
	private int maxSpeed=120;
	
	CarBuilder buildModel(String model) {
		this.model=model;
		return this;
	}

	CarBuilder buildTransmission(Transmission transmission) {
		this.transmission=transmission;
		return this;
	}

	CarBuilder buildMaxSpeed(int maxSpeed) {
		this.maxSpeed=maxSpeed;
		return this;
	}
	
	public Car build() {
		Car car=new Car();
		car.setModel(model);
		car.setTransmission(transmission);
		car.setMaxSpeed(maxSpeed);
		return car;		
	}	
		
	@Override
	public String toString() {
		return this.toString();
	}

	
}