package com.xala3pa.strategy.rules;

import com.xala3pa.strategy.RuleBehavior;

public class TimeRule implements RuleBehavior {

    @Override
    public boolean applyRule() {

        System.out.println("applying time rule");
        return true;
    }
}
