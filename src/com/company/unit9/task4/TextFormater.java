package com.company.unit9.task4;

import java.util.Locale;

public class TextFormater {
    public static int wordsNumber(String line) {
        String[] words = line.split(" ");
        return words.length;
    }

    public static boolean hasPalindrom(String line) {
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            String lowerCase = words[i].toLowerCase(Locale.ROOT);
            StringBuilder stringBuilder = new StringBuilder(lowerCase);
            String reversed = stringBuilder.reverse().toString();
            if (reversed.equals(lowerCase)) {
                return true;
            }

        }
        return false;
    }
}
