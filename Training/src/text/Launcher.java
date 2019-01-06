package text;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Launcher implements Comparable {

	public static void main(String[] args) {

		String [] arr= {"Dynamo","Metalist","Dnipro","Ajax"};
		
		Arrays.sort(arr, new Task());
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(2);
		
		Set<String> set=new TreeSet(String.CASE_INSENSITIVE_ORDER.reversed());
		for (String s : arr) {
			set.add(s);
		}
		System.out.println(set);
		
		System.out.println(3);
		

		
		
	}

	@Override
	public int compareTo(Object o) {
		return this.toString().compareToIgnoreCase(o.toString());
	}

}
