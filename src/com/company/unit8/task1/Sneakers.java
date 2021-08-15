package com.company.unit8.task1;

public class Sneakers implements Shoes{
    @Override
    public void putOn() {
        System.out.println("надел(а) кроссовки");
    }

    @Override
    public void takeOff() {
        System.out.println("снял(а) кроссовки");
    }
}
