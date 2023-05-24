package lb3;

public class Nod implements BinaryOperations {
    @Override
    public String getOperationName() {
        return "Nod";
    }
    
    @Override
    public char getOperationSymbol() {
        return 'G';
    }
    
    @Override
    public int calculate(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return calculate(num2, num1 % num2);
    }
}
