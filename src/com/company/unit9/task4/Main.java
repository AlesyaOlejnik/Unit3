package com.company.unit9.task4;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("task4.txt");
        Scanner scanner = new Scanner(fileReader);

        FileWriter fileWriter = new FileWriter("task4result.txt");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int number = TextFormater.wordsNumber(line);
            if (TextFormater.hasPalindrom(line) || (number >= 3 && number <= 5)){
                 fileWriter.write(line);
                 fileWriter.write("\n");
            }
        }

        fileReader.close();
        fileWriter.close();
    }
}
