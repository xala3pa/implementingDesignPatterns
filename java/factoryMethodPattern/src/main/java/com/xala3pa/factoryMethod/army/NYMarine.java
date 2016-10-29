package com.xala3pa.factoryMethod.army;

public class NYMarine extends Soldier {

    private static final String MARINE = "NY Marine";
    private static final String M9_BERETTA = "M9 Beretta";
    private static final String M_16 = "M16";
    private static final String BAYONET = "Bayonet";

    public NYMarine() {
        type = MARINE;
        weapons.add(M9_BERETTA);
        weapons.add(M_16);
        weapons.add(BAYONET);
    }
}
