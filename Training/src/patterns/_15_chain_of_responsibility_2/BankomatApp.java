package patterns._15_chain_of_responsibility_2;

public class BankomatApp {

	public static void main(String[] args) {
		NoteModule noteModule500=new NoteModule500();
		NoteModule noteModule200=new NoteModule200();
		NoteModule noteModule100=new NoteModule100();
		NoteModule noteModule50=new NoteModule50();
		NoteModule noteModule20=new NoteModule20();
		NoteModule noteModule10=new NoteModule10();
		noteModule500.setNextMoneyModule(noteModule200);
		noteModule200.setNextMoneyModule(noteModule100);
		noteModule100.setNextMoneyModule(noteModule50);
		noteModule50.setNextMoneyModule(noteModule20);
		noteModule20.setNextMoneyModule(noteModule10);
		noteModule500.takeMoney(new Money(410));
	}

}

class Note{
	public static final int H10=10;
	public static final int H20=20;
	public static final int H50=50;
	public static final int H100=100;
	public static final int H200=200;
	public static final int H500=500;	
}

class Money{
	private int amt;

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		if (amt>=Note.H10 && amt<=10_000 && amt%Note.H10==0)
			this.amt = amt;
		else
			throw new RuntimeException("Сума грошей має бути в діапазоні 10-10 тис. грн. і кратна 10 грн.");
	}

	public Money(int amt) {
		setAmt(amt);
	}
	
}

abstract class NoteModule{
	protected NoteModule next;
	abstract void takeMoney(Money money);
	void setNextMoneyModule(NoteModule module) {
		next=module;		
	}	
}

abstract class SuperNoteModule extends NoteModule{	
	int nominal;
	
	public SuperNoteModule(int nominal) {this.nominal = nominal;}

	@Override
	void takeMoney(Money money) {
		int countNote=money.getAmt()/nominal;
		int remind=money.getAmt()%nominal;
		if (countNote>0)
			System.out.println("Видано "+countNote +" купюр номіналом "+ nominal);
		if (remind>0 && next!=null)
			next.takeMoney(new Money(remind));
	}	
}
/*
class NoteModule500 extends SuperNoteModule{public NoteModule500(){nominal=500;}}
class NoteModule200 extends SuperNoteModule{public NoteModule200(){nominal=200;}}
class NoteModule100 extends SuperNoteModule{public NoteModule100(){nominal=100;}}
class NoteModule50 extends SuperNoteModule{public NoteModule50(){nominal=50;}}
class NoteModule20 extends SuperNoteModule{public NoteModule20(){nominal=20;}}
class NoteModule10 extends SuperNoteModule{public NoteModule10(){nominal=10;}}
*/
class NoteModule500 extends SuperNoteModule{public NoteModule500(){super(Note.H500);}}
class NoteModule200 extends SuperNoteModule{public NoteModule200(){super(Note.H200);}}
class NoteModule100 extends SuperNoteModule{public NoteModule100(){super(Note.H100);}}
class NoteModule50 extends SuperNoteModule{public NoteModule50(){super(Note.H50);}}
class NoteModule20 extends SuperNoteModule{public NoteModule20(){super(Note.H20);}}
class NoteModule10 extends SuperNoteModule{public NoteModule10(){super(Note.H10);}}