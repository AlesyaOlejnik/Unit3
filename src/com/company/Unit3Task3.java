package com.company;

import java.util.Random;

public class Unit3Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[15];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(99);
        }
        int counter = 0;
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
            if (mas[i] % 2 == 0){
                counter++;
            }
        }
        System.out.println();
        System.out.println("Количество чётных чисел =  " + counter);
    }
}
