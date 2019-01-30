package patterns._19_visitor;

import title.Title;

public class VisitorApp {
	public static void main(String[] args) {
		/*
		Element body=new BodyElement();
		Element engine=new EngineElement();
		Visitor hooligan=new HooliganVisitor();
		
		body.accept(hooligan);
		engine.accept(hooligan);
		
		Visitor mechanic=new MechanicVisitor();
		
		body.accept(mechanic);
		engine.accept(mechanic);
		*/
		Title.begin("start");
		for (int i=0;i<1000_000;i++) {
			Element car=new CarElement();
			car.accept(new HooliganVisitor());
			System.out.println();
			car.accept(new MechanicVisitor());
		}
		Title.finish("finish");
	}
}

interface Visitor{
	void visit(EngineElement engine);
	void visit(BodyElement engine);
	void visit(CarElement engine);	
	void visit(WheelElement engine);	
}

interface Element{
	void accept(Visitor visitor);
}

class BodyElement implements Element{
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);		
	}	
}

class EngineElement implements Element{
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);	
	}
}

class WheelElement implements Element{
	private String name;
	public WheelElement(String name) {this.name=name;}
	public String getName() {return this.name;}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);		
	}	
}

class CarElement implements Element{
	private Element [] elements;
	public CarElement() {
		this.elements=new Element[] {new WheelElement("переднє ліве"),
				new WheelElement("переднє праве"),
					new WheelElement("заднє ліве"),
						new WheelElement("заднє праве"),
							new BodyElement(),
								new EngineElement()};		
	}
	@Override
	public void accept(Visitor visitor) {
		for (Element element : elements) {
			element.accept(visitor);
		}
		visitor.visit(this);		
	}	
}

class HooliganVisitor implements Visitor{
	@Override
	public void visit(EngineElement engine) {
		System.out.println("Завів двигун");		
	}
	@Override
	public void visit(BodyElement body) {
		System.out.println("Постукав по корпусу");		
	}
	@Override
	public void visit(CarElement car) {
		System.out.println("Палив у машині");		
	}
	@Override
	public void visit(WheelElement wheel) {
		System.out.println("Підкачав " + wheel.getName()+" колесо");		
	}	
}

class MechanicVisitor implements Visitor{
	@Override
	public void visit(EngineElement engine) {
		System.out.println("Перевірив двигун");		
	}
	@Override
	public void visit(BodyElement body) {
		System.out.println("Відполірував кузов");
	}
	@Override
	public void visit(CarElement car) {
		System.out.println("Відполірував кузов");
	}
	@Override
	public void visit(WheelElement wheel) {
		System.out.println("Підкачав " + wheel.getName()+" колесо");		
	}
}