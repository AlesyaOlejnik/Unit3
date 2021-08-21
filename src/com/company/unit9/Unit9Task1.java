package com.company.unit9;

public class Unit9Task1 {
    public static void main(String[] args) {
        char a = 'в';
        char b = 'к';
        String s = "абвгдейка";
        System.out.println(substring(s, a, b));
    }

    private static String substring(String text, char start, char end) {
        int startIndex = text.indexOf(start);
        int lastIndex = text.lastIndexOf(end);
        return text.substring(startIndex, lastIndex);
    }


}
