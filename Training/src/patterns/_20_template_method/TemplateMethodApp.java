package patterns._20_template_method;

import org.omg.Messaging.SyncScopeHelper;

public class TemplateMethodApp {

	public static void main(String[] args) {
		C a=new A();
		a.templateMethod();
		
		System.out.println();
		
		C b=new B();
		b.templateMethod();
	}
}

abstract class C{
	void templateMethod() {
		System.out.print(1);
		differ();
		System.out.print(3);
	}
	abstract void differ();
}

class A extends C{
	void differ() {
		System.out.print(2);
	}	
}

class B extends C{
	void differ() {
		System.out.print(4);
	}
}