package patterns._3_abstract_factory.transport.impl.aircraft;

import patterns._3_abstract_factory.transport.interfaces.Aircraft;

public class Mriya implements Aircraft{

	@Override
	public void flight() {
		System.out.println("Mriya is flying");
		
	}

}
