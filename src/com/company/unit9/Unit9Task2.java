package com.company.unit9;

public class Unit9Task2 {
    public static void main(String[] args) {
        String text = "абвгдейка";
        System.out.println(changedString(text));
    }

    private static String changedString(String text){
        char charAt0 = text.charAt(0);
        char charAt3 = text.charAt(3);
        return text.replaceAll(String.valueOf(charAt3), String.valueOf(charAt0));
    }
}
