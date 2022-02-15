package com.company;

import java.util.Scanner;

/*
Print all integer numbers from 1 to N, except that are multiple of
3(Input N from console)
*/
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int first = 1;
        while (first <= N) {
            if (first % 3 == 0) {
                first++;
                continue;
            }
                System.out.print(first + " ");
                first++;
        }
    }
}
