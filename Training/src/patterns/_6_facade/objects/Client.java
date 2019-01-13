package patterns._6_facade.objects;

import patterns._6_facade.facade.CarFacade;
import patterns._6_facade.parts.Acceleration;
import patterns._6_facade.parts.Door;
import patterns._6_facade.parts.Wheel;

public class Client {
	
	public static void main(String [] args) {
		
		Door door=new Door();
		door.open();
		
		Wheel wheel=new Wheel();
		wheel.turn();
		
		Acceleration acceleration=new Acceleration();
		acceleration.acceleration();
		
		System.out.println();
		
		CarFacade carFacade=new CarFacade();
		carFacade.go();
		
	}

}
