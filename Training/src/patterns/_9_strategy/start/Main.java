package patterns._9_strategy.start;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import patterns._9_strategy.auth.UserChecker;
import patterns._9_strategy.strategy.AuthStrategy;
import patterns._9_strategy.strategy.DBAuth;
import patterns._9_strategy.strategy.FileAuth;

public class Main {

	public static void main(String[] args) throws IOException {
		
		final String s1="visitor";
		final String s2="qwerty";
		final String pathUri="https://google.com";
		final String pathFSO="C://";

		UserChecker userChecker=new UserChecker();
		userChecker.check(new DBAuth(pathUri));
		userChecker.check(new FileAuth(new File(pathFSO)));
		
		/*
		uc.setName(s1);
		uc.setPassword(s2);
		AuthStrategy strategy1=new DBAuth(pathUri);
		
		AuthStrategy strategy2=new FileAuth(new File(pathFSO));
		boolean check1=uc.check(strategy1);
		boolean check2=uc.check(strategy2);
		*/
		
		

	}

}
