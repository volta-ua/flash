package Json;

import com.google.gson.Gson;

public class Starter {

	public static void main(String[] args) {
		System.out.println(new Gson().toJson(new myClass()));
	}
	
}

class myClass{
	String s="Hello World";
}
