package patterns._18_iterator;

import java.util.Arrays;

public class IteratorApp {

	public static void main(String[] args) {
		Container collection=new Tasks();
		Iterator iterator=collection.getIterator();		
		while(iterator.hasNext())
			System.out.println((String)iterator.next());
	}
}

interface Iterator{
	boolean hasNext();
	Object next();
}

interface Container{
	Iterator getIterator();
}

class Tasks implements Container{	
	String [] tasks= {"Збудувати будиинок","Посадити садок","Виростити сина"};

	@Override
	public Iterator getIterator() {
		return new TaskIterator();
	}
		
	private class TaskIterator implements Iterator{		
		private int index=0;
		@Override
		public boolean hasNext() {
			try {
				Thread.sleep(750);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return index<tasks.length?true:false;
		}
		@Override
		public Object next() {			
			return tasks[index++];
		}		
	}
}
