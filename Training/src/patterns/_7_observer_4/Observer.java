package patterns._7_observer_4;

public interface Observer {
	
	void register(EnterClickListener listener);
	void detach(EnterClickListener listener);
	void inform();

}
