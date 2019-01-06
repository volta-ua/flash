package comparison;

import java.util.Comparator;

public class NameCompare implements Comparator<Car> {

	@Override
	public int compare(Car arg0, Car arg1) {
		// TODO Auto-generated method stub
		return arg0.getName().compareToIgnoreCase(arg1.getName());
	}

}
