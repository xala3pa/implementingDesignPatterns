package com.xala3pa.adapterPattern.dc;

public class Batman implements Dc {
    @Override
    public void flight() {
        System.out.println("Flying using my cape");
    }

    @Override
    public void strength() {
        System.out.println("My fists are like iron");
    }
}
