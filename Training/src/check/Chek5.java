package check;

import java.util.Arrays;

public class Chek5 {

	public static void main(String[] args) {
		Auto[] list=new Sedan[] {new ClassA("ZAZ"), new ClassB("Deu")};
		
		System.out.println(Arrays.toString(list));

	}

}

interface Auto{
	void move();	
}

abstract class Sedan implements Auto{
	private String name;
	
	public Sedan(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Sedan [name=" + name + "]";
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
		
}

class ClassA extends Sedan{

	public ClassA(String name) {
		super(name+"_of_A");
	}
	
}

class ClassB extends Sedan{

	public ClassB(String name) {
		super(name+"_of_B");
	}
	
}