package patterns._11_builder;

public class BuilderApp {

	public static void main(String[] args) {
		CarBuilder carBuilder=new CarBuilder("BMW",Transmission.AUTO,190);
		System.out.println(carBuilder);
	}
	
}

enum Transmission{
	MANUAL, AUTO
}

class Car{
	String model;
	Transmission transmission;
	int maxSpeed;
	
	String zzz="=======================================";
	@Override
	public String toString() {
		return zzz+"\n=====  model=" + model + "\n=====  transmission=" + transmission + "\n=====  maxSpeed=" + maxSpeed+"\n"+zzz;
	}
	public void setModel(String make) {this.model = make;}
	public void setTransmission(Transmission transmission) {this.transmission = transmission;}
	public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}
	
}

class CarBuilder{
	
	private Car car;
	
	@Override
	public String toString() {
		return car.toString();
	}

	public CarBuilder(String model, Transmission transmission,int maxSpeed) {
		car=new Car();
		car.setModel(model);
		car.setTransmission(transmission);
		car.setMaxSpeed(maxSpeed);		
	}
}