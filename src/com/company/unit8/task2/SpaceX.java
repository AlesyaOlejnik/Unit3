package com.company.unit8.task2;

import java.util.Random;

public class SpaceX implements IStart {
    @Override
    public boolean prelaunchSystemCheck() {
        Random random = new Random();
        return random.nextBoolean();
    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатели SpaceX запущены");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}
