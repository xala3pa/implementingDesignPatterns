package com.xala3pa.strategy;

import com.xala3pa.strategy.gateways.Gateway;
import com.xala3pa.strategy.gateways.VisaGateway;
import com.xala3pa.strategy.rules.PriceRule;
import com.xala3pa.strategy.rules.SourceRule;
import com.xala3pa.strategy.rules.TimeRule;

public class RuleSimulator {
    public static void main(String[] args) {
        Gateway gateway = new VisaGateway(new PriceRule());
        gateway.display();
        gateway.performRule();

        gateway.setRuleBehavior(new TimeRule());
        gateway.display();
        gateway.performRule();

        gateway.setRuleBehavior(new SourceRule());
        gateway.display();
        gateway.performRule();
    }
}
