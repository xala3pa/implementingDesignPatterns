package com.xala3pa.proxyPattern;

public class RealGateway implements Gateway {
    private String gatewayName;

    public RealGateway(String gatewayName) {
        this.gatewayName = gatewayName;
        loadGateway(gatewayName);
    }

    private void loadGateway(String gatewayName) {
        System.out.println("Loading gateway " + gatewayName);
    }

    @Override
    public void pay() {
        System.out.println("Payment using " + gatewayName);
    }
}
