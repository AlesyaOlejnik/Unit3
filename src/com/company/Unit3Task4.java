package com.company;

import java.util.Random;

public class Unit3Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[20];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(20);
            System.out.print(mas[i] + " ");
        }

        for (int i = 1; i < mas.length; i = i + 2) {
            mas[i] = 0;
        }

        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

    }
}
