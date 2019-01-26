package patterns._10_delegate;

public class DelegareApp {

	public static void main(String[] args) {
		A obj=new A();
		obj.f();				
		
		B objB=new B();
		objB.f();	
	}

}

class A{
	
	void f() {
		System.out.println("f");	
	
	}
}

class B{
	
	A a=new A();
		
	void f() {
		a.f();
	}
}