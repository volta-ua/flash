package check;

public class Check15 {

	public static void main(String[] args) {
		boolean b=true;
		Object bOb=new Boolean(b);
		int i=Boolean.valueOf(b).hashCode();
		System.out.println(i);
		
		boolean bb=true;
		Object bbOb=new Boolean(bb);
		int ii=Boolean.valueOf(bb).hashCode();
		System.out.println(ii);
		
		System.out.println(bb==b);
		System.out.println(bOb==bbOb);
		System.out.println(bOb.equals(bbOb));

	}

}
