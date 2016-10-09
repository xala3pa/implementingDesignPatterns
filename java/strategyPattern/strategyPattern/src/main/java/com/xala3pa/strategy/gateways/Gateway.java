package com.xala3pa.strategy.gateways;

import com.xala3pa.strategy.RuleBehavior;

public abstract class Gateway {
    RuleBehavior ruleBehavior;

    public void setRuleBehavior(RuleBehavior ruleBehavior) {
        this.ruleBehavior = ruleBehavior;
    }

    public abstract void display();

    public boolean performRule() {
        return ruleBehavior.applyRule();
    }
}
