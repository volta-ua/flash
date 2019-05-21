package service;

import model.ItemHolder;

public class Scheduler {
	
	private static ItemHolder itemHolder;
	
	Scheduler(ItemHolder itemHolder){
		Scheduler.itemHolder=itemHolder;
	}
	
	public static void runPermanentAction(long periodMin) {
		while(true) {
			try {
				Thread.sleep(periodMin*60000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
	

