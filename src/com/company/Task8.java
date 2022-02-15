package com.company;

import java.util.Random;
import java.util.Scanner;

/*
Input N natural number till N would be the exact power of 2.If N is
the exact power of 2 .
- Print N
- Print count of input integers
- break loop
*/
public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temp = 1;
        int count = 0;
        while (true) {
            int num = scanner.nextInt();
            temp=1;
            count ++;
            while (temp < num) {
                temp *= 2;

            }
            if(temp==num){

                System.out.println("Correct number is " + temp + ". That is the " + count + "-th number.");
                break;
            }

        }
    }
}