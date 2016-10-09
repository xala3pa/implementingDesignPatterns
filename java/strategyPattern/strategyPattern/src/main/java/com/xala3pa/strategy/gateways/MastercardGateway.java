package com.xala3pa.strategy.gateways;

import com.xala3pa.strategy.RuleBehavior;

public class MastercardGateway extends Gateway {

    public MastercardGateway(RuleBehavior ruleBehavior) {
        super(ruleBehavior);
    }

    @Override
    public void display() {
        System.out.print("Mastercard Gateway: ");
    }
}
