package patterns._17_proxy;

public class ProxyApp {

	public static void main(String[] args) {
		
		//without proxy
		Image image=new RealImage("D:/Pics/autumn.jpg");
		image.display();
		//without proxy
		Image imageByProxy=new ProxyImage("D:/Pics/autumn.jpg");
		imageByProxy.display();		
	}
}

interface Image{
	void display();
}

class RealImage implements Image{
	
	String file;
	
	public RealImage(String file) {
		this.file = file;
		load();
	}

	void load() {
		System.out.println("loading: "+file);
	}
	
	@Override
	public void display() {
		System.out.println("display: "+file);		
	}
	
}

class ProxyImage implements Image{
	
	String file;
	RealImage image;

	public ProxyImage(String file) {
		this.file = file;
	}

	@Override
	public void display() {
		if(image==null)		
			image=new RealImage(file);
		image.display();	
	}
	
	
}