package com.company;

import java.util.Random;

public class Unit3Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = random.nextInt(15);
            System.out.print(mas1[i] + " ");
            sum1 = mas1[i] + sum1;

        }
        System.out.println();


        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = random.nextInt(15);
            System.out.print(mas2[i] + " ");
            sum2 = mas2[i] + sum2;
        }
        sum1 = sum1 / mas1.length;
        sum2 = sum2 / mas2.length;

        System.out.println();
        if (sum1 > sum2) {
            System.out.println("среднее арифметическое первого больше");
        } else if (sum2 > sum1) {
            System.out.println("среднее арифметическое второго больше");
        } else {
            System.out.println("они равны");
        }

    }
}
