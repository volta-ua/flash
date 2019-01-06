package test;

public interface Comparator<T> {
	int compare(T first, T second);
}

class ActualComparator implements Comparator<String> {
	public int compare(String first, String second) {
		return first.compareToIgnoreCase(second);
	}
}