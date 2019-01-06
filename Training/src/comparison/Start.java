package comparison;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Start {

	private static List<Car> cars=new ArrayList();
	
	public static void main(String [] arg) {
		
		YearCompare yearCompare=new YearCompare();
		NameCompare nameCompare=new NameCompare();
		
		Car car1=new Car("BMW",1999);
		Car car2=new Car("ZAZ",2004);
		Car car3=new Car("Opel",2013);
		Car car4=new Car("Nissan",1990);
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		
		Collections.sort(cars);
		
		print(cars);
				
		Collections.sort(cars, nameCompare);
		
		print(cars);
		
		Collections.sort(cars, yearCompare);
		
		print(cars);
		System.out.println("Set: year");
		Set<Car> ts=new TreeSet<>(yearCompare);
		
		ts.add(car1);
		ts.add(car2);
		ts.add(car3);
		ts.add(car4);
		
		print(ts);
		
		System.out.println("Set: name");
		Set<Car> ts1=new TreeSet<>(nameCompare);
		ts1.add(car1);
		ts1.add(car2);
		ts1.add(car3);
		ts1.add(car4);
		
		print(ts1);
	}
	
	public static void print(Collection collection) {
		System.out.println();
		Iterator<Car> it=collection.iterator();
		
		while(it.hasNext()) {
			Car car=it.next();
			System.out.println(car.getName()+"\t\t\t"+car.getYear());
		}
	}

}
