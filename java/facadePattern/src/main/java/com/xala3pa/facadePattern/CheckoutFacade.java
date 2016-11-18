package com.xala3pa.facadePattern;

public class CheckoutFacade {
    Address address;
    Billing billing;
    Payment payment;

    public CheckoutFacade(Address address, Billing billing, Payment payment) {
        this.address = address;
        this.billing = billing;
        this.payment = payment;
    }

    public void buy(){
        address.fillAddressData();
        address.saveAddress();

        billing.fillBillData();
        billing.processBillData();

        payment.selectGateway();
        payment.pay();
    }
}
