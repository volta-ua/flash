package check;

public class Check11 {
	
	static int i=0;

	public static void main(String[] args) {
		doAction();

	}
	
	static void doAction() {
		System.out.println(i++);
		doAction();
	}

}
