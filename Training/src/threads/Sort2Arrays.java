package threads;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;

public class Sort2Arrays extends Thread {
	
	private static final int MAX_SIZE=10_000_000;
	private static final int VALUE_LIMIT1=1000;
	private static final int VALUE_LIMIT2=10;
	
	public static void main(String[] args) throws InterruptedException {
		
		long start=System.currentTimeMillis();
		
		Logger lg=Logger.getLogger(Sort2Arrays.class.getName());
		lg.info("START");
		long [] arr1=new long [MAX_SIZE];
		long [] arr2=new long [MAX_SIZE];
		Random rd=new Random();
		for(int i=0;i<MAX_SIZE;i++) {			
			arr1[i]=rd.nextInt(VALUE_LIMIT1);
			arr2[i]=rd.nextInt(VALUE_LIMIT2);			
		}
		lg.info("DEFINED");		
		
		MyThread0 t1=new MyThread0(arr1);
		MyThread0 t2=new MyThread0(arr2);
			
		t1.start();
		t2.start();
		t1.join();
		t2.join();

		lg.info("FINISH "+(System.currentTimeMillis()-start)/1000+" sec.");
	}	
}
class MyThread0 extends Thread{
	long [] arr;
	MyThread0(long [] arr){
		this.arr=arr;
	}
	
	public void run() {
		processing(arr);
	}
	
	void processing(long [] arr) {
		for (int i=0;i<100;i++) {
			Arrays.sort(arr);	
		}
		System.out.println("done");
	}
}
