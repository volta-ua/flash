package patterns._3_abstract_factory.factory.impl;

import patterns._3_abstract_factory.factory.interfaces.TransportFactory;
import patterns._3_abstract_factory.transport.impl.aircraft.Mriya;
import patterns._3_abstract_factory.transport.impl.car.Lanos;
import patterns._3_abstract_factory.transport.interfaces.Aircraft;
import patterns._3_abstract_factory.transport.interfaces.Car;

public class UkrainianFactory implements TransportFactory {

	@Override
	public Car createCar() {
		return new Lanos();
	}

	@Override
	public Aircraft createAircraft() {
		return new Mriya();
	}

}
