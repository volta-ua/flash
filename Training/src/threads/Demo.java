package threads;

import java.util.Random;

public class Demo{
	
	public static void main(String[] args) throws InterruptedException {		

		long start=System.currentTimeMillis();
		
		myThread d=new myThread();
		
		TimeCounter.setStart();
		d.doSmth();
		d.doSmth();
		d.doSmth();
		d.doSmth();
		TimeCounter.setFinishAndDisplayTime("s");
		TimeCounter.setStart();
		myThread d1=new myThread();
		myThread d2=new myThread();
		myThread d3=new myThread();
		myThread d4=new myThread();
		d1.start();		
		d2.start();
		d3.start();
		d4.start();
		
		d1.join();
		d2.join();
		d3.join();
		d4.join();
		TimeCounter.setFinishAndDisplayTime("s");
		long finish=System.currentTimeMillis();
		System.out.println((finish-start)/1000+"sec.");
	}

}
class myThread extends Thread{

	public void run() {
		doSmth();
	}
	
	void doSmth() {
		long ii=0;
		Random rd=new Random();
		for (int i=0; i<200_000_000;i++)
			ii+=rd.nextInt(1000_000);
		System.out.println(ii);
	}

}


