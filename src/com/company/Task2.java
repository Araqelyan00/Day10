package com.company;
/*
Print all even integer numbers from 1 to 20.
*/
public class Task2 {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 20 && i % 2 == 0){
            System.out.println(i);
            i = i + 2;
        }
    }
}
