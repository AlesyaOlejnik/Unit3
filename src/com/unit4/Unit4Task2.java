package com.unit4;

import java.util.Random;
import java.util.Scanner;

public class Unit4Task2 {
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

        System.out.print("Нечётные числа под главной диагональю: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0;j<i; j++ ){
                if (mass[i][j] % 2 !=0){
                    System.out.print(mass[i][j] + " ");
                }
            }
        }
    }
}
