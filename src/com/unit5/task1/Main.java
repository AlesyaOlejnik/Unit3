package com.unit5.task1;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel", 1024 , 512, 1);
        computer.displayInfo();
        computer.turnOn();
        computer.turnOff();
    }
}
