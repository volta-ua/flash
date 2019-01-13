package patterns._2_factory;

public class Porshe implements Car {

	@Override
	public void drive() {
		
		System.out.println("Porshe is flying");
		
	}

	@Override
	public void stop() {
		
		System.out.println("Parachute is opening");
		
	}

}
