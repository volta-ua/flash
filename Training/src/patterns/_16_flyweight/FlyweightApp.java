package patterns._16_flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class FlyweightApp {

	public static void main(String[] args) {
		ShapeFactory shapeFactory=new ShapeFactory();
		List<Shape> shapes=new ArrayList<>();
		shapes.add(shapeFactory.getShape("point"));
		shapes.add(shapeFactory.getShape("point"));
		shapes.add(shapeFactory.getShape("square"));
		shapes.add(shapeFactory.getShape("square"));
		shapes.add(shapeFactory.getShape("circle"));
		shapes.add(shapeFactory.getShape("circle"));
		Random rdm=new Random();
		for (Shape shape : shapes) {
			int x=rdm.nextInt(100);
			int y=rdm.nextInt(100);
			shape.draw(x, y);
		}
	}
}

interface Shape{
	void draw(int x, int y);	
}

class Point implements Shape{@Override public void draw(int x, int y) {System.out.println("point:\t"+x+"/"+y);}}
class Circle implements Shape{int r=5; @Override public void draw(int x, int y) {System.out.println("circle:\t"+x+"/"+y+"\t\twith radius:\t"+r);}}
class Square implements Shape{int a=10; @Override	public void draw(int x, int y) {System.out.println("square:\t"+x+"/"+y+"\t\twith edge:\t"+a);}}

class ShapeFactory{
	private static final Map<String, Shape> shapes=new HashMap<>();
	public Shape getShape(String shapeName) {
		Shape shape=shapes.get(shapeName);
		if (shape==null) {
			switch(shapeName){
				case "circle":
					shape=new Circle();
					break;
				case "square":
					shape=new Square();
					break;
				case "point":
					shape=new Point();
					break;
			}
			shapes.put(shapeName, shape);
		}
		return shape;	
	}
	
	
}