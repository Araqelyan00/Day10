package com.company;

import java.util.Scanner;

/*
Given an integer number, greater than 2.Find and print the
smallest natural divisor other than 1 for a given number.Input
number from console.
*/
public class Task4 {
    public static void main(String[] args) {
        System.out.print("Please input a number grater than 2: num = ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 2;
        while (num % i != 0){
            i++;
        }
        System.out.println(i);
    }
}
