package patterns._2_factory_3;

import java.util.Date;

public class FactoryMathodApp2 {

	public static void main(String[] args) {
		WatchMaker obj=new RomanWatchMaker();
		Watch myWatch=obj.createWatch();
		myWatch.showTime();	
		
		WatchMaker obj1=new DigitalWatchMaker();
		Watch myWatch1=obj1.createWatch();
		myWatch1.showTime();
		
		//String s=null;
		WatchMaker obj2=getMakerByName("Roman");
		obj2.createWatch().showTime();		
	}
	
	public static WatchMaker getMakerByName(String maker) {
		//if ("Digital".equals(maker))	//NullPointerException safe
		if (maker.equals("Digital")) //NullPointerException prone
			return new DigitalWatchMaker();
		else if ("Roman".equals(maker))
			return new RomanWatchMaker();
		else
			throw new RuntimeException("Unsupported maker "+maker);
	}
	
}


interface Watch{
	void showTime();
}

class DigitalWatch implements Watch{

	@Override
	public void showTime() {
		System.out.println(new Date());		
	}
	
}

class RomanWatch implements Watch{

	@Override
	public void showTime() {
		System.out.println("XXX");		
	}
	
}

interface WatchMaker{
	Watch createWatch();
}

class DigitalWatchMaker implements WatchMaker{

	@Override
	public Watch createWatch() {
		return new DigitalWatch();		
	}
	
}

class RomanWatchMaker implements WatchMaker{

	@Override
	public Watch createWatch() {
		return new RomanWatch();		
	}
	
} 
