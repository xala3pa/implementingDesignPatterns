package com.xala3pa.factoryMethod.army;

public class SFMarine extends Soldier {

    private static final String MARINE = "SF Marine";
    private static final String M9_BERETTA = "M9 Beretta";
    private static final String M_16 = "M16";
    private static final String BAYONET = "Bayonet";

    public SFMarine() {
        type = MARINE;
        weapons.add(M9_BERETTA);
        weapons.add(M_16);
        weapons.add(BAYONET);
    }
}
