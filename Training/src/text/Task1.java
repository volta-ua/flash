package text;

public class Task1 {
	
	String s;
	
	
	
	public Task1(String s) {
		super();
		this.s = s;
	}

	public String getS() {
		return s;
	}
	
	public void setS(String s) {
		this.s = s;
	}



	public static void main(String[] args) {
		
		String [] arr= {"a","c","b"};
		
		for (String s : arr) {
			Task1 t=new Task1(s);
		}
		

	}

}
