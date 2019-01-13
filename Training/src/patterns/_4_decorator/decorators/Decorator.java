package patterns._4_decorator.decorators;

import patterns._4_decorator.objects.Component;

public abstract class Decorator implements Component {
	
	protected Component component;

	public Decorator(Component component) {
		this.component = component;
	}
	
	public abstract void afterDraw();
	
	public void draw(){
		component.draw();
		afterDraw();
	}
	
}
