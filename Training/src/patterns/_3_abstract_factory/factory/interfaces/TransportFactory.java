package patterns._3_abstract_factory.factory.interfaces;

import patterns._3_abstract_factory.transport.interfaces.Aircraft;
import patterns._3_abstract_factory.transport.interfaces.Car;

public interface TransportFactory {
	
	Car createCar();
	Aircraft createAircraft();

}
