package container;

public class Demo {

	public static void main(String[] args) {
		
		MyArray arr=new MyArray();
		
		arr.put("Як");
		arr.put("умру");
		arr.put("то");
		arr.put("поховайте");
		arr.put(null);
		arr.put("мене");
		arr.put("на");
		arr.put("могилі");
		arr.put("серед");
		arr.put("степу");
		arr.put("ширрокого");
		arr.put("на");
		arr.put("Вкраїні");
		arr.put("милій");
		
		for (int i=0;i<15;i++)
			System.out.println(arr.get());
				
	}

}
