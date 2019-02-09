package patterns._22_interpretor;

public class InterpreterApp {

	public static void main(String[] args) {
		Context context=new Context();
		Expression expr=context.evaluate("777-222+333+111+999-1-1-1-1+111+101-55555555-98989898-4544474-484-4-4-4+9999999+149088218");
		System.out.println(expr.interpret());
	}
}

interface Expression{
	int interpret();
}

class NumberExpression implements Expression{	
	int number;
	public NumberExpression(int number) {this.number = number;}
	public int interpret() {return number;}	
}

class MinusExpression implements Expression{	
	Expression left, right;	
	public MinusExpression(Expression left, Expression right) {this.left = left;this.right = right;}
	public int interpret() {return left.interpret()-right.interpret();}	
}

class PlusExpression implements Expression{	
	Expression left, right;
	public PlusExpression(Expression left, Expression right) {this.left = left;this.right = right;}
	public int interpret() {return left.interpret()+right.interpret();}	
}

class Context{
	Expression evaluate(String s){
		int pos=s.length()-1;
		while(pos>0) {
			if(Character.isDigit(s.charAt(pos)))
				pos--;
			else {
				Expression left=evaluate(s.substring(0, pos));
				Expression right=new NumberExpression(Integer.valueOf(s.substring(pos+1,s.length())));
				char operator=s.charAt(pos);
				switch(operator) {
					case '-': return new MinusExpression(left,right);						
					case '+': return new PlusExpression(left,right);
				}
			}			
		}
		int result=Integer.valueOf(s);
		return new NumberExpression(result);	
	}
}