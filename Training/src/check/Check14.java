package check;

public class Check14 {

	public static void main(String[] args) {
		doSomething(new Object().hashCode(),new Object().hashCode(),new Object().hashCode());
	}
	
	static void doSomething(int i, String s) {
		System.out.println(1);
	}
	
	static void doSomething(String s, int i) {
		System.out.println(2);
	}
	
	static void doSomething(String s) {
		System.out.println(3);
	}
	
	static void doSomething(int i) {
		System.out.println(4);
	}
	
	static void doSomething(int i1, int i2, int i3) {
		System.out.println(5);
	}

}
