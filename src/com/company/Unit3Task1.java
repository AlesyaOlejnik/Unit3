package com.company;

public class Unit3Task1 {
    public static void main(String[] args) {
        int[] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = i * 2 + 2;
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}
