package deployment;

public class Deployment {
	
	private static boolean isDeployment=false;
	
	public static String retriveProjectNameInURI() {
		String s;
		s=isDeployment ? "" : "/Project_NP";
		return s;
	}
	

}
