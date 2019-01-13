package patterns._7_observer_4;

import java.util.LinkedList;
import java.util.List;

import title.Title;

public class Enter implements Observer {
	
	private List<EnterClickListener> listeners=new LinkedList();

	@Override
	public void register(EnterClickListener listener) {
		listeners.add(listener);
		
	}

	@Override
	public void detach(EnterClickListener listener) {
		listeners.remove(listener);
		
	}

	@Override
	public void inform() {
		
		Title.begin("go");
		
		for (EnterClickListener l : listeners)
			l.clickEnterHandling();
		
		Title.finish("done");
	}
	
}
