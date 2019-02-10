package check;

import java.util.HashMap;
import java.util.Map;

public class Check7 {

	public static void main(String[] args) {
		final Map<String, String>map=new HashMap<>();
		map.put("France", "Paris");
		Map<String, String>map2=new HashMap<>();
		//map=map2; //restricted by final keyword
		map2=map;
		System.out.println(map);

	}

}
