package lb3;

public interface BinaryOperations {
    String getOperationName(); // первый метод выводит название операции
    char getOperationSymbol(); // второй метод – знак операции
    int calculate(int num1, int num2); // третий метод – принимает два аргумента и возвращает результат операции
}