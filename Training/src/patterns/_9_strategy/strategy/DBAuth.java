package patterns._9_strategy.strategy;

public class DBAuth implements AuthStrategy{
	
	private Object dbRef;
	private String dbUrl;
	
	public DBAuth(String dbUrl) {
		this.dbUrl=dbUrl;
	}
	
	private void createConnection(String dbUrl) {
		
	}

	@Override
	public boolean checkLogin(String name, String password) {		
		System.out.println("Checking with DB");
		String userHash=getHash(name);
		String passHash=getHash(password);
		return checkUser(userHash,passHash);
	}
	
	
	private boolean checkUser(String name, String password) {
		return true;
	}
	
	
	private String getHash(String name) {
		// TODO Auto-generated method stub
		return "28DA7777HS";
	}

}
