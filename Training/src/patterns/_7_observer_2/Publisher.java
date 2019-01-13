package patterns._7_observer_2;

import java.util.LinkedList;
import java.util.List;

public class Publisher implements PublisherInterface {
	
	private List<PublisherActionListener> listeners=new LinkedList();

	@Override
	public List<PublisherActionListener> getListener(PublisherActionListener listener) {
		// TODO Auto-generated method stub
		return listeners;
	}

	@Override
	public void addListener(PublisherActionListener listener) {
		// TODO Auto-generated method stub
		listeners.add(listener);
	}

	@Override
	public void removeListener(PublisherActionListener listener) {
		// TODO Auto-generated method stub
		listeners.remove(listener);
	}

	@Override
	public void removeAllListeners() {
		listeners.clear();
		
	}

	@Override
	public void notifySubscribers(String message) {
		
		for (PublisherActionListener pal : listeners)
			pal.doAction(message);
		
	}
	
	public void createNewMessage(String message){
		System.out.println("The new message has been created");
		notifySubscribers(message);
	}
	
	
}
