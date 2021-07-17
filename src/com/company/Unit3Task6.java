package com.company;

import java.util.Random;

public class Unit3Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[4];
        boolean isIncreasing = true;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
            System.out.print(mas[i] + " ");
        }
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i + 1] < mas[i]) {
                isIncreasing = false;
                break;
            }
        }

        System.out.println();

        if (isIncreasing) {
            System.out.println("массив строго возрастающий");
        } else {
            System.out.println("массив не строго возрастающий");
        }

    }
}
