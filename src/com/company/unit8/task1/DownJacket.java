package com.company.unit8.task1;

public class DownJacket implements Jacket{
    @Override
    public void putOn() {
        System.out.println("надел(а) пуховик");
    }

    @Override
    public void takeOff(){
        System.out.println("снял(а) пуховик");
    }
}
