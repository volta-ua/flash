package patterns._7_observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements PublusherInterface{
	
	private List<PublisherActionListener> listeners=new ArrayList();

	@Override
	public List<PublisherActionListener> getListeners(){
		return listeners;		
	}
	
	@Override
	public void addListener(PublisherActionListener listener){
		listeners.add(listener);		
	}
	
	@Override
	public void removeListener(PublisherActionListener listener){
		listeners.remove(listener);		
	}
	
	@Override
	public void removeAllListener(){
		listeners.clear();
	}
	
	@Override
	public void notifySubscribers(String message){
		
		for(PublisherActionListener pal : listeners) {
			pal.doAction(message);
		}
		
	}
	
	public void createNewMessage(String message){
		System.out.println("Publish printed message"+message);
		notifySubscribers(message);
	}

	
	
	

}
