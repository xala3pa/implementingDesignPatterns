package com.xala3pa.strategy.rules;

import com.xala3pa.strategy.RuleBehavior;

public class SourceRule implements RuleBehavior {

    public static final String APPLYING_SOURCE_RULE = "Applying source rule";

    @Override
    public String applyRule() {

        return APPLYING_SOURCE_RULE;
    }
}
