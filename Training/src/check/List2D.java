package check;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class List2D {

	public static void main(String[] args) {
		List<Object>list1=new LinkedList<>();
		list1.add(new Integer(1));
		list1.add(new String("s"));
		list1.add(new Object());
		System.out.println(list1.size());
		List<Object>list2=new LinkedList<>();
		list2.add(new Double(55));
		list2.add(new Boolean(true));
		list2.add(new Object());
		list2.add(new Object());
		list2.add(new Object());
		System.out.println(list2.size());
		List<Object>list3=new LinkedList<>();
		list3.add(list1);
		list3.add(list2);
		System.out.println(list3.size());
		
		for(Object o : list3)
			System.out.println(o);
	}

}
