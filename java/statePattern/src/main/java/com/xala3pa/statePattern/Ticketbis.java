package com.xala3pa.statePattern;

public class Ticketbis {
    public static void main(String[] args) {
        Purchase purchase = new Purchase();

        Pending pending = new Pending();
        pending.handleAction(purchase);

        Rejected rejected = new Rejected();
        rejected.handleAction(purchase);

        Confirmed confirmed = new Confirmed();
        confirmed.handleAction(purchase);
    }
}
