package patterns._14_command;

public class CommandApp {

	public static void main(String[] args) {
		Comp c=new Comp();
		User u=new User(new StartCommand(c),new StopCommand(c),new ResetCommand(c));
		u.stopComputer();
		u.stopComputer();
		u.resetComputer();
		u.startComputer();
		u.stopComputer();
	}
	
}

interface Command{
	void execute();
}

//Receiver
class Comp{
	void start() {System.out.println("start");}
	void stop() {System.out.println("stop");}
	void reset() {System.out.println("reset");}	
}

//ConcreteCommand
abstract class SomeCommand implements Command{	
	protected Comp comp;	
	public SomeCommand(Comp comp) {this.comp = comp;}
	@Override
	public abstract void execute();	
}
class StartCommand extends SomeCommand{
	public StartCommand(Comp comp) {super(comp);}
	@Override
	public void execute() {comp.start();}	
}
class StopCommand extends SomeCommand{
	public StopCommand(Comp comp) {super(comp);}
	@Override
	public void execute() {comp.stop();}	
}
class ResetCommand extends SomeCommand{
	public ResetCommand(Comp comp) {super(comp);}
	@Override
	public void execute() {comp.reset();}	
}

//Invoker
class User{
	private Command start;
	private Command stop;
	private Command reset;
	public User(Command start, Command stop, Command reset) {
		this.start = start;
		this.stop = stop;
		this.reset = reset;
	}
	void startComputer() {start.execute();}
	void stopComputer() {stop.execute();}
	void resetComputer() {reset.execute();}
}