package com.xala3pa.commandPattern.superHeros;

public class Batman implements SuperHero {
    @Override
    public void flight() {
        System.out.println("It is awesome have the ability of fly using technology");
    }

    @Override
    public void superStrength() {
        System.out.println("People are usually impressed by my combat abilities");
    }
}
