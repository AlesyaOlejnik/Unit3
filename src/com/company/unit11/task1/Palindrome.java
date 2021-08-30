package com.company.unit11.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Locale;


public class Palindrome {
    public static void main(String[] args) {


        try (BufferedReader filereader = new BufferedReader(new FileReader("src\\com\\company\\unit11\\task1\\task1.txt"));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter("src\\com\\company\\unit11\\task1\\task1_output.txt"))) {

            String line;
            while ((line = filereader.readLine()) != null){
                String lowerCase = line.toLowerCase(Locale.ROOT);
                StringBuilder sb = new StringBuilder(lowerCase);
                String reversedLine = sb.reverse().toString();
                if (lowerCase.equals(reversedLine)){
                    fileWriter.write(line);
                    fileWriter.write("\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
