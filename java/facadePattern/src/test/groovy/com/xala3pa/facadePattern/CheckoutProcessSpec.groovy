package com.xala3pa.facadePattern

import spock.lang.Specification


class CheckoutProcessSpec extends Specification {
    def "should make whole checkout Process whe we invoke buy"(){
        given:
        Address address = Mock()
        Billing billing = Mock()
        Payment payment = Mock()
        and:
        CheckoutFacade checkoutFacade = new CheckoutFacade(address, billing, payment)

        when:
        checkoutFacade.buy()

        then:
        1 * address.fillAddressData()
        1 * address.saveAddress()
        1 * billing.fillBillData()
        1 * billing.processBillData()
        1 * payment.selectGateway()
        1 * payment.pay()
    }
}
