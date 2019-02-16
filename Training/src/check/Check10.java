package check;

public enum Check10 {

	
	ITEM_1{
		public void doSomething() {
			System.out.println(1);
		}
	};
	
	abstract void doSomething();
	
	public static void main(String[]args) {
		ITEM_1.doSomething();
}

}
