package caching;

import javax.swing.JOptionPane;

public class CachingApp {

	public static void main(String[] args) {
		double input=0, output;
		
		while (input==8888) {
			input=Double.parseDouble(JOptionPane.showInputDialog("Enter the value"));
			System.out.print(input+"\t");
			
			
			
			output=doCalc(input);
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
