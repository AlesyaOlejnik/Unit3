package com.company;

import java.util.Random;

public class Unit3Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[12];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(15);
            System.out.print(mas[i] + " ");
        }

        int indexOfMax = 0;
        int max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (max <= mas[i]) {
                indexOfMax = i;
                max = mas[i];
            }
        }

        System.out.println();
        System.out.println("Максимальное значение равно "+ max +" и его последний индекс равен " + indexOfMax);
    }
}
