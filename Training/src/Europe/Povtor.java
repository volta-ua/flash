package Europe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Povtor implements Comparable<Povtor> {
	
	private String s;
	
	
	@Override
	public String toString() {
		return s;
	}


	public Povtor(String s) {
		super();
		this.s = s.toUpperCase();
	}


	public static void main(String[] args) {
		
		String [] arr= {"C","b","A"};
		
		List<String> list=new ArrayList();
		
		for(String s : arr) {
			list.add(s);
		}
		
		list.sort(new Comparator1());
		
		print(list);
		
		Set<Povtor> listNew=new TreeSet();
		for(String s : arr) {
			listNew.add(new Povtor(s));
		}
		print(listNew);
	}


	private static void print(Collection list) {
		Iterator<Povtor> it=list.iterator();
		System.out.println("====================================");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}


	@Override
	public int compareTo(Povtor o) {

		return o.toString().compareToIgnoreCase(this.toString());
	}

}
