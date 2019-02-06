package caching;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class CachingApp {

	public static void main(String[] args) {
		double input=0, output;
		Map<Double, Double> cache=new HashMap();
		
		while (input<100) {
			try {
				input=Double.parseDouble(JOptionPane.showInputDialog("Enter the value"));
			}catch(Exception e) {
				System.out.println(e.getLocalizedMessage());
				input=0;
			}
			System.out.print(input+"\t");
			
			if (cache.containsKey(input))
				output=cache.get(input);
			else {
				output=doCalc(input);
				cache.put(input, output);
			}
			System.out.println(output);
		}
		
	}
	
	static double doCalc(double i) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Math.pow(i, 2);
	}

}
