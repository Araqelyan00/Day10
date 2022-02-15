package com.company;

import java.util.Scanner;

/*
14.The deposit in the bank is x dollars. It increases annually by p
percent, after which the fractional part of cents is discarded.
Determine how many years the contribution will be at
least y dollars.(Input x , p , y from console)
*/
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int p = scanner.nextInt();
        int y = scanner.nextInt();
        int year = 0;
        while (x < y){
            x += 0.1 * x;
            year++;

        }
        System.out.println(year);
    }
}
