package com.company.unit11.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\com\\company\\unit11\\task2\\task2.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\com\\company\\unit11\\task2\\task2_output.txt"))){

            String line;
            while((line = bufferedReader.readLine()) != null){
                boolean hasPalendrom = TextFormater.hasPalendrom(line);
                int wordCount = TextFormater.wordCount(line);
                if (hasPalendrom || (wordCount >=3 && wordCount<=5)){
                    bufferedWriter.write(line);
                    bufferedWriter.write("\n");
                }
            }
        }
    }
}
