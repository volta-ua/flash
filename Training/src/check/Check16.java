package check;

public class Check16 {

	public static void main(String[] args) {
		
		Check16 c=new Check16();
		c.doSuperAction(new A1() {
			@Override
			String doF() {
				System.out.println("doFFF");
				return null;
			}			
		});

	}
	
	void doSuperAction(Object ob) {
		System.out.println("doSuperAction");
	}

}

class A1{
	
	A1(){
		System.out.println("A");
	}
	
	String doF() {
		System.out.println("doF");
		return null;
	}
	
}

