package patterns._23_mediator_2;

import java.util.ArrayList;
import java.util.List;

public class MedaitorApp2 {
	public static void main(String[] args) {		
		TextChat chat=new TextChat();
		User admin=new Admin(chat,"Sysadmin");
		User user1=new SimpleUser(chat,"Vovan");
		User user2=new SimpleUser(chat,"Baton");
		User user3=new SimpleUser(chat,"Hacker");
		user2.setEnable(false);
		chat.setAdmin(admin);		
		chat.addUser(user1);
		chat.addUser(user2);
		chat.addUser(user3);
		//admin.setEnable(false);
		user1.sendMessage("Pryvit!");
		admin.sendMessage("breaking news");
	}
}

abstract class User{
	private Chat chat;
	private String name;
	private boolean isEnable=true;
	
	public User(Chat chat, String name) {
		this.chat = chat;
		this.name = name;
	}		
	
	boolean isEnable() {return isEnable;}
	
	void setEnable(boolean b) {isEnable=b;}
	
	String getName() {return name;}
	
	public void sendMessage(String message) {chat.sendMessage(message, this);}
	
	abstract void getMessage(String message);

	public String toString() {
		return "User [name=" + name + "]";
	}	
	
}

class Admin extends User{
	public Admin(Chat chat, String name) {super(chat,name);}
	public void getMessage(String message) {System.out.println("Admin "+getName()+" is getting the message: \t'"+message+"'");}
}

class SimpleUser extends User{
	public SimpleUser(Chat chat, String name) {super(chat,name);}
	public void getMessage(String message) {System.out.println("User "+getName()+" is getting the message: \t'"+message+"'");}
}

interface Chat{
	void sendMessage(String message, User user);
}

class TextChat implements Chat{
	private User admin;
	private List<User>users=new ArrayList<>();
	
	public void setAdmin(User admin) {
		if (admin!=null && admin instanceof Admin) {
			this.admin=admin;
			//users.add(admin);
		}else
			throw new RuntimeException("is not permittred!");
	}
	
	public void addUser(User user) {
		if (admin==null)
			throw new RuntimeException("admin is missed");
		
		if (user instanceof SimpleUser)
			users.add(user);
		else {
			throw new RuntimeException("admin is not allowed to participate in another chat");
		}
	}

	@Override
	public void sendMessage(String message, User user) {
		if(user instanceof Admin) {
			for(User u : users)
				u.getMessage(u.getName()+": "+message);
		}
		if (user instanceof SimpleUser) {
			for(User u : users) {
				if(u!=user && u.isEnable())
					u.getMessage(u.getName()+": "+message);
			}
			if (admin.isEnable())
				admin.getMessage(message);
		}
	}
}
