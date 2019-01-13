package patterns._4_decorator;

import patterns._4_decorator.decorators.BorderDecorator;
import patterns._4_decorator.decorators.ColourDecorator;
import patterns._4_decorator.objects.Button;
import patterns._4_decorator.objects.Component;
import patterns._4_decorator.objects.TextView;
import patterns._4_decorator.objects.Window;

public class Starter {
	
	private static Component window;
	private static Component textView;
	private static Component button;	

	public static void main(String[] args) {
				
		Component windowWithBorder=new BorderDecorator(new Window());
		windowWithBorder.draw();
		
		System.out.println();
		
		Component windowWithBorderWithColour=new ColourDecorator(new BorderDecorator(new Window()));
		windowWithBorderWithColour.draw();
		
		System.out.println();
		
		Component textViewWithColour=new ColourDecorator(new TextView());
		textViewWithColour.draw();
		
		System.out.println();
		
		boolean showBorder=true;

		if (showBorder) {
			window=new ColourDecorator(new Window());
			textView=new ColourDecorator(new TextView());
			button=new ColourDecorator(new Button());
		} else
		{
			window=new Window();
			textView=new TextView();
			button=new Button();
		}
		
		window.draw();
		
		System.out.println();
		
		textView.draw();
		
		System.out.println();
		
		button.draw();
		
	}

}
