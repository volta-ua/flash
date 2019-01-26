package check;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IndexOf {

	public static void main(String[] args) {
		
		String ob1="ob1";
		Integer ob2=5;
		
		
		List<String> list=new ArrayList();
		
		list.add(ob1);
		
		List<Integer> list2=new LinkedList();
		list2.add(ob2);
		
		Object ob3=new Exception();
		
		
		System.out.println(list.indexOf(ob3));
		
		Throwable e1=new Exception();
		Throwable e2=new Exception();
		System.out.println("In real "+e1.equals(e2));
		List<Throwable> list3=new LinkedList();
		list3.add(e1);
		list3.add(e2);
		System.out.println(list3.indexOf(e2));

	}

}
