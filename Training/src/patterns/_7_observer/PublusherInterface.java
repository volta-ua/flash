package patterns._7_observer;

import java.util.List;

public interface PublusherInterface {
	
	List<PublisherActionListener> getListeners();

	void addListener(PublisherActionListener listener);

	void removeListener(PublisherActionListener listener);

	void removeAllListener();

	void notifySubscribers(String message);

}