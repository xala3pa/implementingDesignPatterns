package com.xala3pa.facadePattern;

public class CheckoutProcess {
    public static void main(String[] args) {
        Address address = new Address();
        Billing billing = new Billing();
        Payment payment = new Payment();

        CheckoutFacade checkoutFacade = new CheckoutFacade(address, billing, payment);
        checkoutFacade.buy();
    }
}
