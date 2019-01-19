package patterns._8_state.state;

public class MoveState implements TransformerState{

	@Override
	public void action() {
		System.out.println("Moving");
		
	}

}
