package com.xala3pa.commandPattern;

import com.xala3pa.commandPattern.command.SuperPower;

public class PowersTransfer {
    private SuperPower superPower;

    public void setSuperPower(SuperPower superPower) {
        this.superPower = superPower;
    }

    public void transfer(){
        superPower.action();
    }
}
