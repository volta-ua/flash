package patterns._9_strategy.strategy;

public interface AuthStrategy {

	boolean checkLogin(String name, String password);
	
}
