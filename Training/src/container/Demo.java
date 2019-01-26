package container;

public class Demo {

	public static void main(String[] args) {
		
		MyArray arr=new MyArray();
		
		arr.put("як");
		arr.put("умру");
		arr.put("то");
		arr.put("поховайте");
		arr.put(null);
		arr.put("мене");
		arr.put("на");
		arr.put("могил≥");
		arr.put("серед");
		arr.put("степу");
		arr.put("широкого");
		arr.put("на");
		arr.put("¬крањн≥");
		arr.put("мил≥й");
		
		for (int i=0;i<15;i++)
			System.out.println(arr.get());
				
	}

}
