package patterns._6_facade.facade;

import patterns._6_facade.parts.Acceleration;
import patterns._6_facade.parts.Door;
import patterns._6_facade.parts.Wheel;

public class CarFacade {
	
	private Door door=new Door();
	private Wheel wheel=new Wheel();
	private Acceleration acceleration=new Acceleration();

	public void go() {
		
		door.open();
		wheel.turn();
		acceleration.acceleration();		
		
	}

}
