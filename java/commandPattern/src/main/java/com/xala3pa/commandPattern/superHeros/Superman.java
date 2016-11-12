package com.xala3pa.commandPattern.superHeros;

public class Superman implements SuperHero {
    @Override
    public void flight() {
        System.out.println("It is awesome have the ability of fly");
    }

    @Override
    public void superStrength() {
        System.out.println("People are usually impressed by my strength");
    }
}
