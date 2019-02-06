package check;

public class Check1 {

	public static void main(String[] args) {
		Base b=new Sub();
		
	}

}

class Base{
	void doAction() {
		System.out.println("Base");
	}
}

class Sub extends Base{
	void doAction() {
		System.out.println("Sub");
	}
}
