package patterns._15_chain_of_responsibility;

public class ChainApp {

	public static void main(String[] args) {
		Logger logger0=new SMSLogger(Level.ERROR);
		Logger logger1=new FileLogger(Level.DEBUG);
		Logger logger2=new EmailLogger(Level.INFO);		
		logger0.setNext(logger1);
		logger1.setNext(logger2);		
		
		logger0.writeMessage("OK",Level.INFO);
		logger0.writeMessage("TEST",Level.DEBUG);
		logger0.writeMessage("FIX",Level.ERROR);
	}

}

class Level{
	public static final int ERROR=1;
	public static final int DEBUG=2;
	public static final int INFO=3;
}

abstract class Logger{
	protected String concreteLogger;
	int priority;	
	public Logger(int priority) {this.priority = priority;}
	Logger next;
	public void setNext(Logger next) {this.next = next;}
	public void writeMessage(String message, int level) {
		if (level<=priority)
			System.out.println(concreteLogger+message);
		if (next!=null)
			next.writeMessage(message, level);		
	}	
}

class SMSLogger extends Logger{
	public SMSLogger(int priority) {
		super(priority);
		concreteLogger="SMS is about \t\t";
	}	
}

class FileLogger extends Logger{
	public FileLogger(int priority) {
		super(priority);
		concreteLogger="File system is \t\t";
	}	
}

class EmailLogger extends Logger{
	public EmailLogger(int priority) {
		super(priority);
		concreteLogger="Mail was sent about\t";
	}	
}
