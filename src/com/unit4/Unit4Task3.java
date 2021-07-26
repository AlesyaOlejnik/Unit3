package com.unit4;

import java.util.Random;
import java.util.Scanner;

public class Unit4Task3 {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int mass[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = random.nextInt(50);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        int prodMain = 1;
        int prodAdd = 1;
        for (int i = 0; i < n; i++) {
            prodMain *= mass[i][i];
            prodAdd *= mass[n-1-i][i];
        }
        if (prodMain>prodAdd){
            System.out.print("Произведение элементов главной диагонали больше");
        }else
            System.out.println("Произвдеение элементов побочной диагонали больше");
    }
}
