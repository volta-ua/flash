package patterns._7_observer_2;

public class Starter {

	public static void main(String[] args) {
		
		PublisherActionListener subscriber1=new Subscriber1();
		PublisherActionListener subscriber2=new Subscriber2();
		PublisherInterface publisher=new Publisher();
		
		publisher.addListener(subscriber1);
		publisher.addListener(subscriber2);
		
		((Publisher)publisher).createNewMessage("777");
		
	}

}
