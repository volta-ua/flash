package comparison;

import java.util.Comparator;

public class YearCompare implements Comparator<Car> {

	@Override
	public int compare(Car arg0, Car arg1) {
		Integer i0=new Integer(arg0.getYear());
		Integer i1=new Integer(arg1.getYear());
		return i1.compareTo(i0);
	}

}

