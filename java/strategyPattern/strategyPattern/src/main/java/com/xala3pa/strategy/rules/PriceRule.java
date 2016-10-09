package com.xala3pa.strategy.rules;

import com.xala3pa.strategy.RuleBehavior;

public class PriceRule implements RuleBehavior {

    @Override
    public boolean applyRule() {

        System.out.println("Applying price rule");
        return true;
    }
}
