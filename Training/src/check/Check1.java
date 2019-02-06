package check;

public class Check1 {

	public static void main(String[] args) {
		Base b=new Sub();
		System.out.println(b.i);
		
		Sub s=new Sub();
		System.out.println(((Base)s).i); //явне перевтілення можна робити для виклику змінних. З методом не вдасться
		System.out.println(s.i);
	}
}

class Base{
	protected int i=5;
	void doAction() {
		System.out.println("Base");
	}
}

class Sub extends Base{
	protected int i=6;
	void doAction() {
		System.out.println("Sub");
	}
}
