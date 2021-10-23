package com.pb.Peresada.HomeWork3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Заполните массив");
        int[] mas = new int[10];//создаем  массив размером 10
        for (int i = 0; i < mas.length; i++) {
            mas[i] = input.nextInt();// заполняем массив с клавиатуры
        }
        System.out.println("Заполненый массив");
        for (int i=0;i < mas.length;i++){
            System.out.print(mas[i]+ " ");// Выводим заполненый массив на экран
        }
        System.out.println();

        int sum = 0;
        for(int i=0; i < mas.length;i++) {
            sum = sum + mas[i];//Считаем сумму елементов в массиве
        }
        System.out.println("Сумма елементов массива " + sum);

        int counter=0;//Обьявили пустую целочисленную переменую
        for(int i=0; i < mas.length;i++){
            if(mas[i]>0)//Посчитали количество елементов в массиве которые больше 0, если таких больше 0,тогда переменная +1
                counter +=1;
        }
        System.out.println("Количество положительных елементов массива " + counter);
        //сортировка пузыриком
        boolean isSorted = false;// флаг того что массив отсортирован или нет
        int buf;//временная переменная для замены елементов массива
        while(!isSorted) {
            isSorted = true; // предпологаем что массив отсортирован
            for (int i = 0; i < mas.length-1; i++) {//что бы не выйти за пределы массива, береме первый елемент массива -1
                if(mas[i] > mas[i+1]){
                    isSorted = false;
                    buf = mas[i]; // начало обмена переменных
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));

    }
 }
