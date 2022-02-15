package com.company;

import java.util.Scanner;

/*
On the first day, the athlete ran x kilometers,and then every day
he increased the mileage by 10% from the previous value,Given the
number y, determine the number of the day for which the athlete's
mileage will be at least y kilometers.
*/
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        int days = 1;
        while (x < y){
            x = x + (x * 0.1);
           // System.out.println(x);
            days++;
        }
        System.out.println(days);
    }
}
