package com.company.unit8.task2;

public class Cosmodrom {

    public void run(IStart iStart) {
        if (!iStart.prelaunchSystemCheck()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            iStart.engineStarting();
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
            }
            iStart.start();
        }
    }
}


