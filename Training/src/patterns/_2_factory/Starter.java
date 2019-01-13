package patterns._2_factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Starter {

	public static void main(String[] args) {

		Car jeep=new Jeep();
		jeep.drive();
		
		Car porshe=new Porshe();
		porshe.drive();
		
		System.out.println("========================");
		System.out.println("and using Fabric:");
		CarSelector cs=new CarSelector();
		List<Car> carList=new ArrayList();
		
		Car c1=cs.getCar(RoadType.CITY);
		c1.drive();
				
		carList.add(cs.getCar(RoadType.GAZON));
		carList.add(cs.getCar(RoadType.OFF_ROAD));
		carList.add(cs.getCar(RoadType.CITY));
		carList.add(cs.getCar(RoadType.OFF_ROAD));
		
		Iterator<?> it=carList.iterator();
		while(it.hasNext()) {
			Car c=(Car)it.next();
			c.drive();
		}		

	}

}
