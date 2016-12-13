package com.xala3pa.statePattern;

//Context class
public class Purchase {
    private State state = null;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
