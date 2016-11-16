package com.xala3pa.adapterPattern.marvel;

public class Hulk implements Marvel{
    @Override
    public void jump() {
        System.out.println("When I jump, it looks like I can fly");
    }

    @Override
    public void strength() {
        System.out.println("I can destroy everything");
    }
}
