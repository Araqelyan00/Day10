package com.company;

import java.util.Scanner;

/*
Write a Java Program to Compute the Sum of Digits in a given
Integer.
*/
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
