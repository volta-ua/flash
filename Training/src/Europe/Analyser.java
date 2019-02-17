package Europe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Analyser {

	public static void main(String[] args) {
		
		Country c1=new Country("Ukraine",42,604,"Kyiv");
		Country c2=new Country("France",65,404,"Paris");
		Country c3=new Country("Italy",58,354,"Rome");
		Country c4=new Country("United Kingdom",65,295,"London");
		Country c5=new Country("Turkey",66,650,"Ankara");
		
		Set<Country> set=new TreeSet();		
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		set.add(c5);
		
		print(set);
		
		System.out.println();
		
		List<Country> list=new ArrayList();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);		
		
		list.sort(new PopulationComparator());
		
		print(list);

	}

	 private static void print(Collection col) {		
		Iterator<Country> it=col.iterator();
		
		while(it.hasNext()) {
			Country c=it.next();
			System.out.println(c);
		}
		
	}

}
