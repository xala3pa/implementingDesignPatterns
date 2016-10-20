package com.xala3pa.strategy.gateways;

import com.xala3pa.strategy.RuleBehavior;

public class VisaGateway extends Gateway {


    public VisaGateway(RuleBehavior ruleBehavior) {
        super(ruleBehavior);
    }

    @Override
    public void display() {
        System.out.print("Visa gateway: ");
    }
}
