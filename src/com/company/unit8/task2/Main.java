package com.company.unit8.task2;

public class Main {
    public static void main(String[] args) {
        Cosmodrom cosmodrom = new Cosmodrom();
        IStart shuttle = new Shuttle();
        IStart spaceX = new SpaceX();

        cosmodrom.run(shuttle);
        cosmodrom.run(spaceX);
    }
}
