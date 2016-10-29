package com.xala3pa.factoryMethod.army;

public class SFSniper extends Soldier {

    public static final String SNIPER = "SF Sniper";
    public static final String CHEYTAC_RIFLE = "Cheytac rifle";
    public static final String SIG_TANGO4 = "SIG TANGO4";
    public static final String KESTREL_5500 = "Kestrel 5500";

    public SFSniper() {
        type = SNIPER;
        weapons.add(CHEYTAC_RIFLE);
        weapons.add(SIG_TANGO4);
        weapons.add(KESTREL_5500);
    }
}
