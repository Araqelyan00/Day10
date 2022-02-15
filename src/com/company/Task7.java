package com.company;

import java.util.Scanner;

/*
For a given integer number N,print all integers that are multiple of
2 in descending order.
*/
public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num > 0){
            if (num % 2 == 0){
            System.out.print(" " +num);
            num = num -2;
        }else{
                System.out.print(" " + (num = num-1));
                num = num - 2;
        }
        }
    }
}
