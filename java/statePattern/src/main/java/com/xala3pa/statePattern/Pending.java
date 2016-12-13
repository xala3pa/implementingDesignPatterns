package com.xala3pa.statePattern;

public class Pending implements State {
    public void handleAction(Purchase purchase) {
        System.out.println("Purchase in pending state...");
        purchase.setState(this);
    }

    @Override
    public String toString() {
        return "Pending State";
    }
}
