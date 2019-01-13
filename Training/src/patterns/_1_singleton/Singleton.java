package patterns._1_singleton;

public class Singleton{

	private static Singleton instance;
	public static final int MAX_CLASSES=5;
	public long createdOnTime;
	public int createdByNumber=0;	
	public static int counter=0;	

	private Singleton() {	
	}
	
	
	private Singleton(long creationTime) {
		createdOnTime=creationTime;
		createdByNumber=counter;
	}

	public static synchronized Singleton getInstance() {
		//if (instance==null) {
		if (counter<MAX_CLASSES) {
			counter++;
			instance=new Singleton(System.currentTimeMillis());				
		}
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(instance);
		return instance;		
	}

	@Override
	public String toString() {		
		return "This is singleton method / "+createdByNumber+" / "+createdOnTime;
	}
			
}
