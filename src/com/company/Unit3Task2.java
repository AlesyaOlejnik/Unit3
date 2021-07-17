package com.company;

public class Unit3Task2 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 100; i = i + 2) {
            counter++;
        }

        int[] mas = new int[counter];
        counter = 0;
        for (int i = 1; i < 100; i = i + 2) {
            mas[counter] = i;
            counter++;
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }

    }
}
