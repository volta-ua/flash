package patterns._7_observer_2;

import java.util.List;

public interface PublisherInterface {
	
	List<PublisherActionListener> getListener(PublisherActionListener listener);
	void addListener(PublisherActionListener listener);
	void removeListener(PublisherActionListener listener);
	void removeAllListeners();
	void notifySubscribers(String message);
	
}
