package patterns._1_singleton;

public class Starter extends Thread {
	
	static int c=0;

	public static void main(String[] args) {
		
		Starter s1=new Starter();
		Starter s2=new Starter();
		Starter s3=new Starter();
		Starter s4=new Starter();
		Starter s5=new Starter();
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
	
		/*
		Singleton sg=Singleton.getInstance();
		System.out.println(sg);
		
		Singleton sg2=Singleton.getInstance();
		System.out.println(sg2);
		
		Singleton sg3=Singleton.getInstance();
		System.out.println(sg3);
		*/
	}
	
	public void run() {
		Singleton sg=Singleton.getInstance();	
	}
	
}
