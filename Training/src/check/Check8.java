package check;

public class Check8 {
	//static int i=1;
	public static void main(String [] args) {
		int i=5;
		doSomething(i);
		System.out.println(i);
		
		AAA a=new AAA("aaa");
		System.out.println(a);
		doSomething(a);
		System.out.println(a);
		
		String s="web";
		System.out.println(s);
		doSomething(s);
		System.out.println(s);
		
		StringBuilder sb=new StringBuilder(String.valueOf(Character.MAX_CODE_POINT));
		System.out.println(sb);
		doSomething(sb);
		System.out.println(sb);
	}
	
	static void doSomething(int i) {
		i++;
	}
	
	static void doSomething(AAA a) {
		a.setName(a.getName()+"_changed");
	}
	
	static void doSomething(String s) {
		s+="_mutated";
	}
	
	static void doSomething(StringBuilder s) {
		s.append("_appended");
	}
	
}

class AAA{
	private String name;

	public AAA(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AAA [name=" + name + "]";
	}
	
}
