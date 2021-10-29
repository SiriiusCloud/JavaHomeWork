package com.pb.Peresada.HomeWork4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Введите текст первый");
        Scanner str1 = new Scanner(System.in);
        String s1 = str1.nextLine();
        System.out.println("Введите текст второй");
        Scanner str2 = new Scanner(System.in);
        String s2 = str2.nextLine();
        //Anagram.isAnagram(s1,s2);
        System.out.println(isAnagram(s1,s2));

    }
    public static boolean isAnagram(String s1, String s2){

        if ( s1.length() != s2.length() ) {
            return false;
        }
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String sc1 = new String(c1);
        String sc2 = new String(c2);
        return sc1.equals(sc2);
    }



}
