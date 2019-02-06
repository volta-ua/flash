package patterns._21_bridge;

public class BridgeApp {

	public static void main(String[] args) {
		Hatchback hatchback=new Hatchback();
		Sedan sedan=new Sedan();
		Cabriolet cabriolet=new Cabriolet();
		
		Zaz zazSedan=new Zaz(sedan);
		Zaz zazHatchback=new Zaz(hatchback);
		Zaz zazCabriolet=new Zaz(cabriolet);
		Pontiac pontiacSedan=new Pontiac(sedan);
		Pontiac pontiacHatchback=new Pontiac(hatchback);
		Pontiac pontiacCabriolet=new Pontiac(cabriolet);
		BMW bmwSedan=new BMW(sedan);
		BMW bmwHatchback=new BMW(hatchback);
		BMW bmwCabriolet=new BMW(cabriolet);
		Mersedes mersedesSedan=new Mersedes(sedan);
		Mersedes mersedesHatchback=new Mersedes(hatchback);
		Mersedes mersedesCabriolet=new Mersedes(cabriolet);
		
		zazSedan.showDetails();
		zazHatchback.showDetails();
		zazCabriolet.showDetails();
		pontiacSedan.showDetails();		
		pontiacHatchback.showDetails();
		pontiacCabriolet.showDetails();
		bmwSedan.showDetails();		
		bmwHatchback.showDetails();
		bmwCabriolet.showDetails();
		mersedesSedan.showDetails();		
		mersedesHatchback.showDetails();
		mersedesCabriolet.showDetails();
	}
}

abstract class Model{
	Type type;
	public Model(Type type) {this.type=type;}
	abstract void showModel();
	void showDetails(){
		showModel();
		type.setType();
	}
}

class Zaz extends Model{

	public Zaz(Type type) {super(type);}

	@Override
	void showModel() {System.out.print("Zaz\t");}
}

class Pontiac extends Model{

	public Pontiac(Type type) {super(type);}

	@Override
	void showModel() {System.out.print("Pontiac\t");}
}

class BMW extends Model{

	public BMW(Type type) {super(type);}

	@Override
	void showModel() {System.out.print("BMW\t");}
}

class Mersedes extends Model{

	public Mersedes(Type type) {super(type);}

	@Override
	void showModel() {System.out.print("Mers\t");}
}

interface Type{
	void setType();
}

class Sedan implements Type{@Override public void setType() {System.out.println("Sedan");}}

class Hatchback implements Type{@Override public void setType() {System.out.println("Hatchback");}}

class Cabriolet implements Type{@Override public void setType() {System.out.println("Cabriolet");}}