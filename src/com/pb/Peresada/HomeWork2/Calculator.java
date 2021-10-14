package com.pb.Peresada.HomeWork2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1 = 'x';
        int operand2 = 'y';
        String sign = "z";
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число");
        int x = in.nextInt();

        System.out.println("Введите второе число");
        int y = in.nextInt();

        System.out.println("Укажите операцию над числами. Доступные операции: '+'  суммирование, '-' вычитание, '*' умножение,'/' деление ");
        String z = in.next();

        switch (z) {
            case "+":
                System.out.println( "Ответ:" + (x + y));
                break;
            case "*":
                System.out.println("Ответ:" + (x * y));
                break;
            case "-":
                System.out.println("Ответ:" +  (x - y));
                break;
            case "/":
                if (y == 0) {
                    System.out.print("Нельзя делить на 0!");
                } else {
                    System.out.println("Ответ:" + (x / y));
                }
                break;
        }
            }
}
