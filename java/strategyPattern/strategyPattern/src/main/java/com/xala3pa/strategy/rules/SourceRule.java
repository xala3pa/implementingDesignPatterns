package com.xala3pa.strategy.rules;

import com.xala3pa.strategy.RuleBehavior;

public class SourceRule implements RuleBehavior {

    @Override
    public boolean applyRule() {

        System.out.println("Applying source rule");
        return true;
    }
}
