package patterns._5_adapter.objects;

import java.util.LinkedList;
import java.util.List;

import patterns._5_adapter.adapter.PrinterAdapter;

public class Client {
	
	public static void main(String  [] args) {
		
		List<String> list=new LinkedList();
		list.add("Page1");
		list.add("Page2");
		list.add("Page3");
		
		PrinterAdapter adapter=new PrinterAdapter();
		
		adapter.print(list);
		
	}
	
}
