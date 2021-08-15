package com.company.unit8.task1;

public class Boots implements Shoes{
    @Override
    public void putOn() {
        System.out.println("надел(а) сапоги");
    }

    @Override
    public void takeOff() {
        System.out.println("снял(а) сапоги");

    }
}
