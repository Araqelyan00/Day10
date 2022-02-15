package com.company;

import java.util.Scanner;

/*
Print all integer powers of two not exceeding N in ascending
order.Input N from console.
*/
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = 1;
        int m = 2;
        while(n <= N){
            System.out.println(n);
            n = m * 2;
            m = m * 2;
        }
    }
}
