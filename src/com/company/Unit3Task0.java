package com.company;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int length = scanner.nextInt();
        int[] mas = new int[length];

        for (int i = 0; i < length; i++) {
            mas[i] = random.nextInt(50);
        }

        for (int i = 0; i < length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
