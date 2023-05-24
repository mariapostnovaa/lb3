package lb3;

public class Mod implements BinaryOperations {
    @Override
    public String getOperationName() {
        return "Mod";
    }
    
    @Override
    public char getOperationSymbol() {
        return '%';
    }
    
    @Override
    public int calculate(int num1, int num2) {
        return num1 % num2;
    }
}