package com.pb.Peresada.HomeWork2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int operand = 'x';
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = in.nextInt();
        if (x >= 0 & x <= 14) {
            System.out.print("Число в интервале [0 - 14]");
        } else if (x >= 15 & x <= 36) {
            System.out.print("Число в интервале [15 - 36]");
        } else if (x >= 36 & x <= 50) {
            System.out.print("Число в интервале [36 - 50]");
        } else if (x >= 51 & x <= 100) {
            System.out.print("Число в интервале [51 - 100]");
        } else {
            System.out.print("Нет нужного интервала");
        }
    }
}