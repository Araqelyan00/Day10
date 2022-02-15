package com.company;

import java.util.Scanner;

/*
For a given natural N print the smallest integer k that`
Math.pow(2,k)≥N.(You can not use Math.pow())
*/
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        while(Math.pow(2,k) <= n){
            k++;
        }
        System.out.println(k);
    }
}
