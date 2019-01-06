package threads;

import java.util.Collections;

public class TimeCounter {
	
	private static long start;
	private static long finish;
	
	public static void setStart() {
		start=System.currentTimeMillis();		
	}
	public static void setFinishAndDisplayTime(String s) {
		if (s==null || s=="")
			return;
		long duration;
		double result;
		finish=System.currentTimeMillis();		
		duration=finish-start;
		double coef;
		switch (s) {
			case "s":
				coef=1000;
				break;
			case "m":
				coef=1000*60;
				break;
			default:
				coef=0;
		}
		result=(double)Math.round(duration*100/coef)/100;
		String line="===============";
		String symb=line.substring(0, 1);
		String interLine=String.join("",Collections.nCopies(11+s.length(),symb));
		String fullLine=line+interLine+line;
		System.out.println(fullLine);
		System.out.printf(line+"%8.2f"+" "+s+". "+line+"\n", result);
		System.out.println(fullLine);
	}

}
