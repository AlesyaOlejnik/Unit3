package com.company.unit8.task1;

public class RainJacket implements Jacket{
    @Override
    public void putOn() {
        System.out.println("надел(а) дождевик");
    }

    @Override
    public void takeOff() {
        System.out.println("снял(а) дождевик");

    }
}
