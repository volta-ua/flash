package patterns._3_abstract_factory.factory.impl;

import patterns._3_abstract_factory.factory.interfaces.TransportFactory;
import patterns._3_abstract_factory.transport.impl.aircraft.Boing;
import patterns._3_abstract_factory.transport.impl.car.Chrisler;
import patterns._3_abstract_factory.transport.interfaces.Aircraft;
import patterns._3_abstract_factory.transport.interfaces.Car;

public class USAFactory implements TransportFactory {

	@Override
	public Car createCar() {
		return new Chrisler();
	}

	@Override
	public Aircraft createAircraft() {
		return new Boing();
	}

}
