package com.xala3pa.strategy;

import com.xala3pa.strategy.gateways.Gateway;
import com.xala3pa.strategy.gateways.VisaGateway;
import com.xala3pa.strategy.rules.PriceRule
import com.xala3pa.strategy.rules.SourceRule
import com.xala3pa.strategy.rules.TimeRule;
import spock.lang.Specification;

public class RuleSimulatorSpec extends Specification{

    Gateway gateway = new VisaGateway(new PriceRule());

    def "Visa gateway apply time rule if has the ability to do it"() {
        expect:
        gateway.performRule() == PriceRule.APPLYING_PRICE_RULE
    }

    def "Visa gateway apply time rule at runtime"() {
        when:
        gateway.setRuleBehavior(new TimeRule());

        then:
        gateway.performRule() == TimeRule.APPLYING_TIME_RULE;
    }

    def "Visa gateway apply source rule at runtime"() {
        when:
        gateway.setRuleBehavior(new SourceRule());

        then:
        gateway.performRule() == SourceRule.APPLYING_SOURCE_RULE;
    }
}
