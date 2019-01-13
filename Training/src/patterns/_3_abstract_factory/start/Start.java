package patterns._3_abstract_factory.start;

import java.util.Random;

import patterns._3_abstract_factory.factory.impl.USAFactory;
import patterns._3_abstract_factory.factory.impl.UkrainianFactory;
import patterns._3_abstract_factory.factory.interfaces.TransportFactory;
import patterns._3_abstract_factory.transport.interfaces.Aircraft;
import patterns._3_abstract_factory.transport.interfaces.Car;

public class Start {
	
	public static void main(String[] args) {
		/*
		TransportFactory t1=new USAFactory();
		Car c1=t1.createCar();
		c1.drive();
		
		TransportFactory t2=new USAFactory();
		Aircraft c2=t2.createAircraft();
		c2.flight();
			
		TransportFactory t3=new UkrainianFactory();
		Car c3=t3.createCar();
		c3.drive();
		
		TransportFactory t4=new UkrainianFactory();
		Aircraft c4=t4.createAircraft();
		c4.flight();
		*/
		TransportFactory t5;
		Aircraft a5;
		Car a55;
		Random r=new Random();
		int choise=r.nextInt(2)+1;		
		if(choise==1)
			t5=new UkrainianFactory();
		else 
			t5=new USAFactory();		
		
		a5=t5.createAircraft();
		a55=t5.createCar();
		a5.flight();		
		a55.stop();
	}

}
