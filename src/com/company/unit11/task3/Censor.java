package com.company.unit11.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Censor {
    public static void main(String[] args) throws Exception {
        List<String> blackListWords = getBlackListWords();
        int counter = 0;
        StringBuilder wrongLines = new StringBuilder();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\com\\company\\unit11\\task3\\task3_text.txt"))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] words = line.split(" ");
                for (String word : words) {
                    if (blackListWords.contains(word)){
                        counter ++;
                        wrongLines.append(line);
                        break;
                    }
                }
            }
            if (counter == 0){
                System.out.println("Текст прошел проверку на цензуру");
            }else{
                System.out.println("Текст не прошел проверку на цензуру");
                System.out.println("Количество не прошедших проверку предложений " + counter);
                System.out.println(wrongLines);
            }
        }

    }

    public static List<String> getBlackListWords() throws Exception {
        List<String> blackList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\com\\company\\unit11\\task3\\task3_blacklist.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                blackList.add(line);
            }
        }
        return blackList;
    }
}
