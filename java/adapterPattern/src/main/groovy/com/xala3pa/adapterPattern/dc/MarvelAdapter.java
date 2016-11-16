package com.xala3pa.adapterPattern.dc;

import com.xala3pa.adapterPattern.marvel.Marvel;

import java.util.stream.IntStream;

public class MarvelAdapter implements Dc {
    private Marvel superHero;

    public MarvelAdapter(Marvel superHero) {
        this.superHero = superHero;
    }

    @Override
    public void flight() {
        IntStream.rangeClosed(1, 8).
                forEach((iteration) -> superHero.jump());
    }

    @Override
    public void strength() {
        superHero.strength();
    }
}
