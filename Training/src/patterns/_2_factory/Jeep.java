package patterns._2_factory;

public class Jeep implements Car {

	@Override
	public void drive() {
		System.out.println("Jeep is driving");
		
	}

	@Override
	public void stop() {
		System.out.println("Jeep has stopped");
		
	}

}
