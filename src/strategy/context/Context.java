package strategy.context;

import strategy.services.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int firstNumber, int secondNumber){
        return strategy.doOperation(firstNumber, secondNumber);
    }
}
