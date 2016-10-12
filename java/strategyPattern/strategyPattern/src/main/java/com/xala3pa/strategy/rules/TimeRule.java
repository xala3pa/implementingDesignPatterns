package com.xala3pa.strategy.rules;

import com.xala3pa.strategy.RuleBehavior;

public class TimeRule implements RuleBehavior {

    public static final String APPLYING_TIME_RULE = "Applying time rule";

    @Override
    public String applyRule() {

        return APPLYING_TIME_RULE;
    }
}
