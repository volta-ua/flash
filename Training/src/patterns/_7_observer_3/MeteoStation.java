package patterns._7_observer_3;

import java.util.LinkedList;
import java.util.List;

import title.Title;

public class MeteoStation implements MeteoStationObserver{
	
	private List<Observer> observers=new LinkedList();
	private int temperature;
	private int pressure;
	
	void setNewData(int temperature, int pressure) {
		this.temperature=temperature;
		this.pressure=pressure;
		notifyObserver();
	}

	public static void main(String[] args) {
		Observer consoleStation=new ConsoleStation();
		Observer failedStation=new ExeggeratedStation();
		Observer exeggeratedStation=new FailedStation();
		MeteoStation meteoStation=new MeteoStation();
		meteoStation.addObserver(consoleStation);		
		meteoStation.addObserver(exeggeratedStation);
		meteoStation.addObserver(failedStation);
		meteoStation.setNewData(33, 766);
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}
	
	@Override
	public void notifyObserver() {
		
		//Titles.start("Notification started");
		Title.begin();
					
		for (Observer o : observers)
			o.handleIvent(temperature,pressure);
		
		//Titles.finish("Notification finished");		
		Title.finish();
	}

}

interface MeteoStationObserver{
	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
}


interface Observer{
	
	final String PART_1="Updated temperature at ";
	final String PART_2=" is ";
	final String PART_3=" and pressure is ";
	
	void handleIvent(int a, int b);
	
	default String resume(int a, int b) {
		String classSimpleName=this.getClass().getSimpleName();
		return PART_1+classSimpleName+
					PART_2+a+
						PART_3+b;
	}
	
}

class ConsoleStation implements Observer{

	@Override
	public void handleIvent(int temp, int pres) {
		System.out.println(resume(temp,pres));		 
	}
	
}
class FailedStation implements Observer{

	@Override
	public void handleIvent(int temp, int pres) {
		temp-=9;
		pres-=54;
		System.out.println(resume(temp,pres));		 
	}
	
	public String resume(int a, int b){
		return a+" and "+b;
		}
	
}
class ExeggeratedStation implements Observer{

	@Override
	public void handleIvent(int temp, int pres) {
		temp++;
		pres++;
		System.out.println(resume(temp,pres));		
	}
	
}


