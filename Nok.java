package lb3;

public class Nok implements BinaryOperations {
    @Override
    public String getOperationName() {
        return "Nok";
    }
    
    @Override
    public char getOperationSymbol() {
        return 'L';
    }
    
    @Override
    public int calculate(int num1, int num2) {
        int gcd = new Nod().calculate(num1, num2);
        return (num1 * num2) / gcd;
    }
}