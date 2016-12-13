package com.xala3pa.statePattern;

public class Rejected implements State {
    public void handleAction(Purchase purchase) {
        System.out.println("Purchase in rejected state...");
        purchase.setState(this);
    }

    @Override
    public String toString() {
        return "Rejected state";
    }
}
