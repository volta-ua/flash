package text;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Task<String> implements Comparator<String>{
		
	@Override
	public int compare(String o1, String o2) {
		return o1.toString().compareToIgnoreCase(o2.toString());
	}




}
