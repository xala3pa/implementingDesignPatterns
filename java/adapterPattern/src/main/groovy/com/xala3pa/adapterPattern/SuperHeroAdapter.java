package com.xala3pa.adapterPattern;

import com.xala3pa.adapterPattern.dc.Batman;
import com.xala3pa.adapterPattern.dc.Dc;
import com.xala3pa.adapterPattern.dc.MarvelAdapter;
import com.xala3pa.adapterPattern.marvel.Hulk;

public class SuperHeroAdapter {
    public static void main(String[] args) {
        Hulk hulk = new Hulk();
        Batman batman = new Batman();

        Dc marvelAdapter = new MarvelAdapter(hulk);

        System.out.println("Batman using his powers: ");
        System.out.println("-------------------------------------------");
        testPowerAdapter(batman);

        System.out.println("Adapting Marvel powers to Dc ones: ");
        System.out.println("-------------------------------------------");
        testPowerAdapter(marvelAdapter);
    }

    static void testPowerAdapter(Dc superHero) {
        superHero.flight();
        superHero.strength();
    }
}
