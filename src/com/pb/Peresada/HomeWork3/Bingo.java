package com.pb.Peresada.HomeWork3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args){
        Random random = new Random();
        int x = random.nextInt(101);
        //System.out.println("r: " + x);
        Scanner in = new Scanner(System.in);
        
        System.out.println("Я загадал целое число, попроуй угадат :) кол-во попыток не ограничено, введи целое число");
        System.out.println("Для того что бы выйти напиши -1");
        int counter=1;
        int y = in.nextInt();

        while (x != y){
            if (y==-1){
                //System.out.println("Игра окончена, твое количество попыток:" +counter);
                break;
            }
            if (x>y){
                counter++;
                System.out.println("Загаданное число больше");
                y = in.nextInt();
            }  else{
                counter++;
                System.out.println("Загаданное число меньше");
                y = in.nextInt();

            }
        }
        if(y==-1){
            System.out.println("Игра окончена, твое количество попыток:" +counter);
        }
        if (x==y){
            System.out.println("BINGO, твое количество попыток:" + counter);
        }

        }
    }


