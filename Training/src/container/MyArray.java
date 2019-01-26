package container;

import java.util.Arrays;

public class MyArray {
	
	private int maxVolume=5;
	private String [] arr=new String[maxVolume];
	private int counter=0;
	
	public void put(String s) {
		if (s==null)
			return;
		if (counter==maxVolume-2) {
			maxVolume*=2;			
			String [] temp=Arrays.copyOf(arr, maxVolume);
			arr=temp;
		}			
		arr[counter++]=s;
	}
	
	public String get() {
		
		if (counter==0)
			return "Nothing to retrive";
		
		String s=arr[0];	
		
		if(counter==1)
			arr=null;	
		else {
			for(int i=1;i<arr.length;i++) {
				arr[i-1]=arr[i];
			}
		}		
		counter--;
		return s;
	}	
	
}
