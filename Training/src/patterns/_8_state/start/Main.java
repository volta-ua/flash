package patterns._8_state.start;

import patterns._8_state.context.TransformerContext;
import patterns._8_state.state.FireState;
import patterns._8_state.state.MoveState;
import patterns._8_state.state.TransformerState;

public class Main {

	public static void main(String[] args) {
		
		TransformerState moving=new MoveState();
		TransformerState firing=new FireState();
		TransformerContext context=new TransformerContext();
		
		context.setState(moving);
		context.action();
		
		context.setState(firing);
		context.action();
		
		context.setState(moving);
		context.action();
		
	}

}
