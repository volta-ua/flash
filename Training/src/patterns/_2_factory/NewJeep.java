package patterns._2_factory;

public class NewJeep extends Jeep {
	
	void newFunction() {
		System.out.println("new ficha");
	}
	
	public void drive() {
		newFunction();
	}

}
