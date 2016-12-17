package com.xala3pa.proxyPattern;

public class GatewayProxy implements Gateway {
    private String gatewayName;
    private Gateway realGateway;

    public GatewayProxy(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    @Override
    public void pay() {
         if (realGateway == null) {
             realGateway = new RealGateway(gatewayName);
         }
        realGateway.pay();
    }
}
