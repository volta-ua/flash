package patterns._4_decorator.decorators;

import patterns._4_decorator.objects.Component;

public class ColourDecorator extends Decorator{

	public ColourDecorator(Component component) {
		super(component);
	}

	@Override
	public void afterDraw() {
		System.out.println("... added a colour");		
	}

}
