package patterns._7_observer_4;

import title.Title;

public class Demo {

	public static void main(String[] args) {
				
		Observer enter=new Enter();
		
		EnterClickListener el1=new Element1();
		EnterClickListener el2=new Element2();
		EnterClickListener el3=new Element3();
		EnterClickListener el4=new Element4();
		EnterClickListener el5=new Element5();
		
		enter.register(el1);
		enter.register(el2);
		enter.register(el3);
		enter.register(el4);
		enter.register(el5);
		
		enter.inform();
		
	}

}
