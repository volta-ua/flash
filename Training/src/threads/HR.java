package threads;

class PeopleQueue extends Thread {
	
	private String[] names;
	
	PeopleQueue (String ... names){
		this.names=names;
	}
	
	@Override
	public void run() {
		for (String s : names) {
			System.out.println("Обработаны документы: " + s);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class HR{
	
	public static void main(String[] args) {
		PeopleQueue p1=new PeopleQueue("a1","a2","a3","a4");
		PeopleQueue p2=new PeopleQueue("A1","A2","A3","A4");
		System.out.println("Начали!");
		p1.start();
		p2.start();
	}
	
}
