package com.xala3pa.strategy.gateways;

import com.xala3pa.strategy.RuleBehavior;

public abstract class Gateway {
    RuleBehavior ruleBehavior;

    public Gateway(RuleBehavior ruleBehavior) {
        this.ruleBehavior = ruleBehavior;
    }

    public void setRuleBehavior(RuleBehavior ruleBehavior) {
        this.ruleBehavior = ruleBehavior;
    }

    public abstract void display();

    public String performRule() {
        return ruleBehavior.applyRule();
    }
}
