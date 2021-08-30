package com.company.unit11.task2;

import java.util.Locale;

public class TextFormater {

    public static int wordCount(String line) {
        String[] words = line.split(" ");
        return words.length;
    }

    public static boolean hasPalendrom(String line) {
        String[] words = line.split(" ");
        for (String word : words) {
            String wordInLowerCase = word.toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(wordInLowerCase);
            String reversedWord = sb.reverse().toString();
            if(reversedWord.equals(wordInLowerCase)){
                return true;
            }
        }
        return false;
    }
}

