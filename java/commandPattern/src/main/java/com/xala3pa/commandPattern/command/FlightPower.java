package com.xala3pa.commandPattern.command;

import com.xala3pa.commandPattern.superHeros.SuperHero;

public class FlightPower implements SuperPower {
    private SuperHero superHero;

    public void setSuperHero(SuperHero superHero) {
        this.superHero = superHero;
    }

    @Override
    public void action() {
       superHero.flight();
    }
}
