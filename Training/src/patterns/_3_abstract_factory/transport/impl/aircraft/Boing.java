package patterns._3_abstract_factory.transport.impl.aircraft;

import patterns._3_abstract_factory.transport.interfaces.Aircraft;

public class Boing implements Aircraft{

	@Override
	public void flight() {
		System.out.println("Boing is flying");
		
	}

}
