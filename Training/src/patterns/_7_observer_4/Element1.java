package patterns._7_observer_4;

public class Element1 implements EnterClickListener {

	@Override
	public void clickEnterHandling() {
		System.out.println("set element invisible");		
	}

}
