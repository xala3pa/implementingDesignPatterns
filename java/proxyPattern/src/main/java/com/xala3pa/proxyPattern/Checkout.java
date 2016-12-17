package com.xala3pa.proxyPattern;

public class Checkout {
    public static void main(String[] args) {
        Gateway adyen = new GatewayProxy("Adyen");

        //first time we load the gateway using de proxy
        adyen.pay();

        //second time we use the gateway in memory
        adyen.pay();
    }
}
