package patterns._3_abstract_factory.transport.impl.car;

import patterns._3_abstract_factory.transport.interfaces.Car;

public class Chrisler implements Car {

	@Override
	public void drive() {
		System.out.println("Chrisler is driving");
		
	}

	@Override
	public void stop() {
		System.out.println("Chrisler has stopped");
		
	}

}
