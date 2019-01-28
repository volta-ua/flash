package patterns._13_composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeApp {

	public static void main(String[] args) {
		Shape s1=new Triangle();
		Shape s2=new Square();
		Shape s3=new Cyrcle();
		Composite composite1=new Composite();
		composite1.addComponent(s1);
		composite1.addComponent(s2);
		composite1.addComponent(s3);
		
		Shape s21=new Triangle();
		Shape s22=new Square();
		Shape s23=new Cyrcle();
		Composite composite2=new Composite();
		composite2.addComponent(s23);		
		composite2.addComponent(s22);
		composite2.addComponent(s21);
		
		Composite compositeTotal=new Composite();
		compositeTotal.addComponent(composite1);
		compositeTotal.addComponent(composite2);
		compositeTotal.draw();
	}

}

interface Shape{
	default void draw() {
		System.out.println("Polymorhic");
	};
}

class Square implements Shape{
	@Override
	public void draw() {System.out.println("Square");}	
}

class Triangle implements Shape{
	@Override
	public void draw() {System.out.println("Triangle");}	
}

class Cyrcle implements Shape{
	@Override
	public void draw() {System.out.println("Cyrcle");}	
}

class Unknown implements Shape{
}

class Composite implements Shape{
	
	private List<Shape> components=new ArrayList();
	
	public void addComponent(Shape shape) {
		components.add(shape);	
	}
	
	public void removeComponent(Shape shape) {
		components.remove(shape);
	}
	
	public void draw() {
		for (Shape component : components) {			
			component.draw();
		}
	}
}

