package strategy;

import strategy.context.Context;
import strategy.services.OperationAdd;
import strategy.services.OperationMultiply;
import strategy.services.OperationSubstract;

public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(" 125 + 15 = " + context.executeStrategy(125, 15));

        context = new Context(new OperationSubstract());
        System.out.println(" 125 - 15 = " + context.executeStrategy(125, 15));

        context = new Context(new OperationMultiply());
        System.out.println(" 125 * 15 = " + context.executeStrategy(125, 15));
    }
}
