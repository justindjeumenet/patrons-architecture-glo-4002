package strategy.services;

public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
