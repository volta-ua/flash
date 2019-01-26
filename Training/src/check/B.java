package check;

public class B extends A{
	
		
	public static void main(String [] args) {
		
		B obj=new B();
		System.out.println(obj.v);
		
		A objA=new A();
		System.out.println(objA);
	}
		
}

class A{
	protected String v;	
	public A(){
		v="sss";
	}
	
	public String toString() {
		return v;
	}
}
