package strategy.services;

public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
