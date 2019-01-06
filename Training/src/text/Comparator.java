package text;

import java.util.Comparator;

class Comp<Task1> implements Comparator<Task1>{

	@Override
	public int compare(Task1 arg0, Task1 arg1) {

		return arg0.toString().compareToIgnoreCase(arg1.toString());
	}

}
