package lb3;

public class Div implements BinaryOperations {
    @Override
    public String getOperationName() {
        return "Div";
    }
    
    @Override
    public char getOperationSymbol() {
        return '/';
    }
    
    @Override
    public int calculate(int num1, int num2) {
        return num1 / num2;
    }
}