package patterns._4_decorator.decorators;

import patterns._4_decorator.objects.Component;

public class BorderDecorator extends Decorator {

	public BorderDecorator(Component component) {
		super(component);
	}

	@Override
	public void afterDraw() {
		System.out.println("... added a border");		
	}

}
