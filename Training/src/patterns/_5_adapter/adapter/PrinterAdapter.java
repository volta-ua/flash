package patterns._5_adapter.adapter;

import java.util.List;

import patterns._5_adapter.objects.Printer;

//add "extends Printer" changing to second method using inheritance 

public class PrinterAdapter implements PageListPrinter{

	private Printer printer=new Printer();
	
	@Override
	public void print(List<String> list) {	
		
		for (String str : list) {
			printer.print(str);
		}
		
	}

}
