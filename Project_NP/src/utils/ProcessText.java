package utils;

public class ProcessText {
	
	public static String processMobileInput(String s) {
		System.out.println("processMobileInput\t"+s);
		if (s==null){
			return null;
		}
		String result=s.replaceAll("[^0-9]", "");
		System.out.println("processMobileInput\t"+result);
		return result;
	}

	public static boolean mobileValidator(String s) {
		return true;
//		System.out.println("mobileValidator\t\t"+s);
//		if (s==null)
//				return false;		
//		if (s.length()!=10)
//			return false;
//		//if (s.matches("\\d+"))
//		//		return false;
//		if (s.charAt(0)!='0')
//				return false;
//		System.out.println("OKmobileValidator\t\t"+s);
//		return true;
	}
}
