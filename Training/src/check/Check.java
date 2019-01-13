package check;

public class Check implements IntDoSmthable, doSmthable, intDoable, doSmthable1, doo {
	
	private static final int FIVE = 5;
	/* (non-Javadoc)
	 * @see check.doSmthable1#doSmth()
	 */
	/* (non-Javadoc)
	 * @see check.doo#doSmth()
	 */
	
	final double PI;
	
	@Override
	public void doSmth() {
		int sd=5;
		int a=FIVE*sd;
		getAa();
	}
	

	private final int ROUTE66 = 66;
	int i;
	
	Check(){
		PI=3.14;
	}
	
		
	public Check(int i) {
		super();
		this.i = i;
		int aa=getAa();
		int bb=ROUTE66;
		PI=3.14;
	}


	/**
	 * @return
	 */
	private int getAa() {
		return 5;
	}



	/* (non-Javadoc)
	 * @see check.intDoable#toString()
	 */
	@Override
	public String toString() {
		return "Check [i=" + i + "]";
	}


	public static void main(String[] args) {
		int i=10;
		System.out.println(new Check().i);
		
		String s1="String";
		String s2=s1;
		s1+="s";
		System.out.println(s2);
		
		Check c1=new Check(1);
		IntDoSmthable c2=c1;
		c1.i=2;
		System.out.println(c2);
		
	}

}
