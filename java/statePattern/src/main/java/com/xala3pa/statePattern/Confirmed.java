package com.xala3pa.statePattern;

public class Confirmed implements State {
    public void handleAction(Purchase purchase) {
        System.out.println("Purchase confirmed state...");
        purchase.setState(this);
    }

    @Override
    public String toString() {
        return "Confirmed State";
    }
}
