package patterns._2_factory;

 public class CarSelector {
	 
	public Car getCar(RoadType roadType) {
		
		Car car=null;
		
		switch(roadType) {
			case CITY:
				car=new Porshe();
				break;
			case OFF_ROAD:
				car=new Jeep();
				break;
			case GAZON:
				car=new NewJeep();
				break;
		}
		
		return car;
		
	}
	
}