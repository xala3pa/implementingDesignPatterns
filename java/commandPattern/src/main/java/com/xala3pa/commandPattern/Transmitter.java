package com.xala3pa.commandPattern;

import com.xala3pa.commandPattern.command.FlightPower;
import com.xala3pa.commandPattern.command.StrengthPower;
import com.xala3pa.commandPattern.superHeros.Batman;
import com.xala3pa.commandPattern.superHeros.SuperHero;
import com.xala3pa.commandPattern.superHeros.Superman;
import com.xala3pa.commandPattern.superHeros.WonderWoman;

public class Transmitter {
    public static void main(String[] args) {
        PowersTransfer powersTransfer = new PowersTransfer();

        SuperHero batman = new Batman();
        StrengthPower strengthPower = new StrengthPower();
        strengthPower.setSuperHero(batman);

        SuperHero wonderWoman = new WonderWoman();
        FlightPower wonderWomanFlightPower = new FlightPower();
        wonderWomanFlightPower.setSuperHero(wonderWoman);

        SuperHero superman = new Superman();
        FlightPower supermanFlightPower = new FlightPower();
        supermanFlightPower.setSuperHero(superman);

        powersTransfer.setSuperPower(wonderWomanFlightPower);
        powersTransfer.transfer();

        powersTransfer.setSuperPower(supermanFlightPower);
        powersTransfer.transfer();

        powersTransfer.setSuperPower(strengthPower);
        powersTransfer.transfer();
    }
}
