package com.xala3pa.commandPattern.superHeros;

public class WonderWoman implements SuperHero {
    @Override
    public void flight(){
        System.out.println("It's cool see things from the sky");
    }

    @Override
    public void superStrength() {
        System.out.println("It's amazing to be able to lift huge dumbbells");
    }
}
