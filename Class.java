package lb3;

public class Class {

	public static void main(String[] args) {
	    BinaryOperations div = new Div();
	    BinaryOperations mod = new Mod();
	    BinaryOperations nod = new Nod();
	    BinaryOperations nok = new Nok();
	    
	    int num1 = 12;
	    int num2 = 8;
	    
	    System.out.println(div.getOperationName() + " " + div.getOperationSymbol() + " " + num1 + " and " + num2 + " = " + div.calculate(num1, num2));
	    System.out.println(mod.getOperationName() + " " + mod.getOperationSymbol() + " " + num1 + " and " + num2 + " = " + mod.calculate(num1, num2));
	    System.out.println(nod.getOperationName() + " NOD(" + num1 + "," + num2 + ") = " + nod.calculate(num1, num2));
	    System.out.println(nok.getOperationName() + " NOK(" + num1 + "," + num2 + ") = " + nok.calculate(num1, num2));
	}

}
