package patterns._3_abstract_factory.transport.impl.car;

import patterns._3_abstract_factory.transport.interfaces.Car;

public class Lanos implements Car {

	@Override
	public void drive() {
		System.out.println("Lanos is driving");
		
	}

	@Override
	public void stop() {
		System.out.println("Lanos has stopped");
		
	}

}
