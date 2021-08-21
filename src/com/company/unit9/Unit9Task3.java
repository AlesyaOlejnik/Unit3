package com.company.unit9;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Locale;
import java.util.Scanner;

public class Unit9Task3 {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("test.txt");
        Scanner scanner = new Scanner(fileReader);

        FileWriter fileWriter = new FileWriter("result.txt");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String lowerCase = line.toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(lowerCase);
            String reversedLine = sb.reverse().toString();
            if (lowerCase.equals(reversedLine)) {
                fileWriter.write(line);
                fileWriter.write("\n");
            }
        }

        fileReader.close();
        fileWriter.close();
    }
}
