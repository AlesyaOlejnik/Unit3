package com.company.unit8.task1;

public class CargoTrousers implements Trousers {
    @Override
    public void putOn() {
        System.out.println("надел(а) брюки карго");
    }

    @Override
    public void takeOff() {
        System.out.println("снял(а)брюки карго");

    }
}
