package strategy.services;

public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
