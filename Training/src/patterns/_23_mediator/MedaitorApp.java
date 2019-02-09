package patterns._23_mediator;

import java.util.ArrayList;
import java.util.List;

public class MedaitorApp {

	public static void main(String[] args) {
		
		TextChat chat=new TextChat();
		
		User user1=new SimpleUser(chat);
		User user2=new SimpleUser(chat);
		User user3=new SimpleUser(chat);
		User admin=new Admin(chat);
		
		chat.addUser(user1);
		chat.addUser(user2);
		chat.addUser(user3);
		chat.setAdmin(admin);
		
		user1.sendMessage("hello! I am 1");
		user2.sendMessage("hello! I am 2");
		user3.sendMessage("hello! I am 3");		
		admin.sendMessage("I am here");

	}

}

interface User{
	void sendMessage(String message);
	void getMessage(String message);
}

class Admin implements User{
	Chat chat;
	public Admin(Chat chat) {this.chat = chat;}
	public void sendMessage(String message) {chat.SendMessage(message, this);}
	public void getMessage(String message) {System.out.println("Received for admin: \t'"+message+'\'');}	
}

class SimpleUser implements User{
	Chat chat;
	public SimpleUser(Chat chat) {this.chat = chat;}
	public void sendMessage(String message) {chat.SendMessage(message, this);}
	public void getMessage(String message) {System.out.println("Received for user: \t'"+message+'\'');}	
}

interface Chat{
	void SendMessage(String message, User user);
}

class TextChat implements Chat{
	private User admin;
	private List<User>users=new ArrayList<>();
	
	public void setAdmin(User admin) {
		if (admin!=null && admin instanceof Admin)		
			this.admin=admin;
		
	}
	
	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void SendMessage(String message, User user) {
		for(User u : users)
			u.getMessage(message);
		admin.getMessage(message);		
	}	
}
