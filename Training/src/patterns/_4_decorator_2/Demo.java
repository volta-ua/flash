package patterns._4_decorator_2;

public class Demo {

	public static void main(String[] args) {
		
		Pizza object=new PizzaStandard();
		PizzaPlus decorator=new SweetPizza(object);
		
		System.out.println(decorator.cost());
		System.out.println(decorator.desc());

	}

}

interface Pizza{
	
	int cost();
	
	String desc();
	
}

class PizzaStandard implements Pizza{

	@Override
	public int cost() {
		return 50;
	}

	@Override
	public String desc() {
		return "Strandard ";
	}
	
}

abstract class PizzaPlus implements Pizza{
	Pizza pizza;
	PizzaPlus(Pizza pizza){
		this.pizza=pizza;
	}
	
}

class SweetPizza extends PizzaPlus{
	
	SweetPizza(Pizza pizza){
		super(pizza);
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return pizza.cost()+5;
	}

	@Override
	public String desc() {
		// TODO Auto-generated method stub
		return pizza.desc()+"plus sugar ";
	}
	
}
