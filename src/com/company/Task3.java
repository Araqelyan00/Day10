package com.company;

import java.util.Scanner;

/*
3.Print all exact squares of natural numbers that are not
exceeding a given positive integer N. Input N from console.
*/
public class Task3 {
    public static void main(String[] args) {
        System.out.print("Please input N : ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = 1;
        int m = 1;
        while (m <= N){
            System.out.println(m);
            n++;
            m = n * n;
        }
    }
}
