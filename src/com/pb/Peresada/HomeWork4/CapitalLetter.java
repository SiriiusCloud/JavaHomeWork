package com.pb.Peresada.HomeWork4;


import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        System.out.println("Введите текст");
        //System.out.println(text);
        Scanner str = new Scanner(System.in);
        String text = str.nextLine();
        String text2 = toUpperCaseForFirstLetter(text);
        System.out.println(text2);




    }
    public static String toUpperCaseForFirstLetter(String text){
        StringBuilder builder = new StringBuilder(text);
        //выставляем первый символ заглавным, если это буква
        if (Character.isAlphabetic(text.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(text.charAt(0)));

        //крутимся в цикле, и меняем буквы, перед которыми пробел на заглавные
        for (int i = 1; i < text.length(); i++)
            if (Character.isAlphabetic(text.charAt(i)) && Character.isSpaceChar(text.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(text.charAt(i)));
        return builder.toString();
    }


    }











