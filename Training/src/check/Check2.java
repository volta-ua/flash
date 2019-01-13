package check;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Check2 implements Checkable, Checkable2, Checkable3, Checkable4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkable4 ch=new Check2();
		
		HashMap<String, String> hm=new HashMap();
		hm.put("1", "2");
		HashMap hm2=new HashMap();
		hm2.putIfAbsent(1, 1);
		hm2.putIfAbsent(1, 4);
		hm2.put(2, 2);
		hm2.put(3, 3);	
		for(String s : hm.keySet()) {}

		for(Object s : hm2.keySet()) {
			System.out.println(hm2.get(s));
		}
		
		System.out.println();
		
		System.out.println(hm2.entrySet());
		
		System.out.println();
		
		HashMap hm3=new HashMap();
		int i=0;
		hm3.put(i, new Country("Ukraine","Kyiv"));
		i++;
		hm3.put(i, new Country("Egypt","Cairo"));
		i++;
		hm3.put(i, new Country("Japan","Tokio"));
		
		Iterator it=hm3.entrySet().iterator();
		
		System.out.println("{");
		while (it.hasNext()) {	
			Map.Entry entry=(Map.Entry)it.next();
			System.out.print("\t"+entry.getValue());
			if (it.hasNext())
				System.out.print(",");
			System.out.println();
		}
		System.out.println("}");
	}
	
	/* (non-Javadoc)
	 * @see check.Checkable3#doSmth()
	 */
	/* (non-Javadoc)
	 * @see check.Checkable4#doSmth()
	 */
	@Override
	public void doSmth() {}

}

class Country{
	@Override
	public String toString() {
		return "{name:" + name + ",\n\tcapital:" + capital + "}";
	}
	private String name;
	private String capital;
	public Country(String name, String capital) {
		super();
		this.name = name;
		this.capital = capital;
	}
}
