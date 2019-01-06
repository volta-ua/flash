package training;

public class Check {
	
	private Object  getObject() {
		return null;
	}
	

	public static void main(String[] args) {
		Check ch=new Check();
		Object s=ch.getObject();
		System.out.println(s);		
		String s1="1";
		String s2="12";
		boolean comparison;
		if (s1==s2)
			comparison=true;
		else 
			comparison=false;
		System.out.println(comparison);
		
		System.out.println("analysis".compareToIgnoreCase("BBC"));
	}

}
