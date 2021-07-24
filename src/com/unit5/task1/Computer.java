package com.unit5.task1;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    String cpu;
    int ram;
    int hdd;
    int livingResource;
    boolean isAlive = true;

    Computer(String cpu, int ram, int hdd, int livingResource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.livingResource = livingResource;
    }

    void displayInfo() {
        System.out.println("Процессор " + cpu + " Оперативка " + ram + " Жёсткий диск " + hdd
                + " Количество жизненных циклов " + livingResource);
    }

    void turnOn() {
        if (!isAlive) {
            System.out.println("Компьютер уже мёртв ");
            return;
        }

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomValue = random.nextInt(2);
        System.out.println("Введите 0 либо 1");
        int userValue = scanner.nextInt();

        if (randomValue == userValue) {

            livingResource--;
            if (livingResource == 0) {
                System.out.println("Количество жизненных циклов " + livingResource + "  компьютер сгорел при включениии");
                isAlive = false;
                return;
            }

            System.out.println("Компьютер включился");
        } else {
            System.out.println("Компьютер сгорел");
            isAlive = false;
        }
    }

    void turnOff() {
        if (!isAlive) {
            System.out.println("Компьютер уже мёртв");
            return;
        }

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomValue = random.nextInt(2);
        System.out.println("Введите 0 либо 1");
        int userValue = scanner.nextInt();

        if (randomValue == userValue) {

            livingResource--;
            if (livingResource == 0) {
                System.out.println("Количество жизненных циклов " + livingResource + " компьютер сгорел при выключении");
                isAlive = false;
                return;
            }

            System.out.println("Компьютер выключился");
        } else {
            isAlive = false;
            System.out.println("Компьютер сгорел");
        }
    }
}
