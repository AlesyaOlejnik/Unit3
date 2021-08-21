package com.company.unit8.task2;

import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean prelaunchSystemCheck() {
        Random random = new Random();
        int randomValue = random.nextInt(10);
         return randomValue > 3;
    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатели шатла запущены.Все системы в норме");

    }

    @Override
    public void start() {
        System.out.println("Старт шатла");

    }

}
