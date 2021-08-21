package com.company.unit8.task1;

public class CulottesTrousers implements Trousers{
    @Override
    public void putOn() {
        System.out.println("надел(а) кюлоты");
    }

    @Override
    public void takeOff() {
        System.out.println("снял(а) кюлоты");
    }
}
