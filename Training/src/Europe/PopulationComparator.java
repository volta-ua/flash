package Europe;

import java.util.Comparator;

public class PopulationComparator implements Comparator<Country> {

	@Override
	public int compare(Country o1, Country o2) {
		Long l1=Long.valueOf(o1.getPopulation());
		Long l2=Long.valueOf(o2.getPopulation());
		return l2.compareTo(l1);		
	}
}

		
