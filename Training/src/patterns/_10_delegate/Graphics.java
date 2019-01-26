package patterns._10_delegate;

public class Graphics {

	public static void main(String[] args) {
		
		Painter p1=new Painter(new Cyrcle());
		p1.draw();
		
		Painter p2=new Painter(new Square());
		p2.draw();
		
		Painter p3=new Painter(new Triangle());
		p3.draw();	
		
	}

}

interface Graphicable{
	void draw();
}

class Triangle implements Graphicable{

	@Override
	public void draw() {
		System.out.println("draw triangle");		
	}
	
}

class Square implements Graphicable{

	@Override
	public void draw() {
		System.out.println("draw square");		
	}
	
}

class Cyrcle implements Graphicable{

	@Override
	public void draw() {
		System.out.println("draw cyrcle");		
	}
	
}

class Painter{
	
	private Graphicable g;
	
	public Painter(Graphicable g) {
		this.g=g;
	}
	
	public void draw() {
		g.draw();		
	}
	
}
