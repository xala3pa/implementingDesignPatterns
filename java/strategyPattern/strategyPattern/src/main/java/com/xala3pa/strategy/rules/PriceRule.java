package com.xala3pa.strategy.rules;

import com.xala3pa.strategy.RuleBehavior;

public class PriceRule implements RuleBehavior {

    public static final String APPLYING_PRICE_RULE = "Applying price rule";

    @Override
    public String applyRule() {

        return APPLYING_PRICE_RULE;
    }
}
