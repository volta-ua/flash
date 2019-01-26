package patterns._11_builder_3;

public class BuilderApp3 {

	public static void main(String[] args) {
		Director director=new Director();
		director.setBuilder(new BugattiBuilder());
		Car car=director.buildCar();
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

abstract class CarBuilder{
	protected Car car;
	void createCar() {car=new Car();}
	abstract void buildModel();
	abstract void buildMaxSpeed();
	abstract void buildTransmission();
	Car getCar() {return car;}
}

class FordModeoBuilder extends CarBuilder{

	@Override
	void buildModel() {car.setModel("Ford Mondeo");}

	@Override
	void buildMaxSpeed() {car.setMaxSpeed(250);}

	@Override
	void buildTransmission() {car.setTransmission(Transmission.AUTO);}
		
}

class SubaruBuilder extends CarBuilder{

	@Override
	void buildModel() {car.setModel("Subaru");}

	@Override
	void buildMaxSpeed() {car.setMaxSpeed(220);}

	@Override
	void buildTransmission() {car.setTransmission(Transmission.MANUAL);}
		
}

class BugattiBuilder extends CarBuilder{

	@Override
	void buildModel() {car.setModel("Bugatti");}

	@Override
	void buildMaxSpeed() {car.setMaxSpeed(499);}

	@Override
	void buildTransmission() {car.setTransmission(Transmission.MANUAL);}
		
}

class Director{
	CarBuilder builder;
	void setBuilder(CarBuilder builder) {
		this.builder=builder;		
	}
	Car buildCar() {
		builder.createCar();
		builder.buildMaxSpeed();
		builder.buildModel();
		builder.buildTransmission();
		Car car=builder.getCar();
		return car;
	}

}

