package test;

public class MyClass<String> implements Comparator {
	
	@Override
	public int compare(Object a, Object b) {
		return a.toString().compareToIgnoreCase(b.toString());
	}

}
