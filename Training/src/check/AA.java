package check;

import java.io.IOException;

public class AA {

	public static void main(String[] args) throws IOException {
		//Runtime.getRuntime().exit(0);
		//Runtime.getRuntime().halt(0);
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		while (true)		
		Runtime.getRuntime().exec("notepad");
		
		//doAction(0,null);
	}
	
	static void doAction(int i, String s) {
		System.out.println(i+s);
	}

}
