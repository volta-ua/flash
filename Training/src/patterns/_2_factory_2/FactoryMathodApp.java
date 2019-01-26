package patterns._2_factory_2;

import java.util.Date;

public class FactoryMathodApp {

	public static void main(String[] args) {
		DigitalWatch obj=(DigitalWatch) Watch.createWatch(new DigitalWatch());
		obj.showTime();
	}

}

interface Watch{
	void showTime();
	
	public static Watch createWatch(Watch w) {
		return w;
	}
	
}

class DigitalWatch implements Watch{

	@Override
	public void showTime() {
		System.out.println(new Date());		
	}
	
	
	
}
