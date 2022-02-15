package com.company;
/*
Write Java program to print the table of characters that are
equivalent to the Ascii codes from 32 to 122.Print 10 characters
at each line.
*/
public class Task10 {
    public static void main(String[] args) {
        int a = 32;
        int z = 122;

        while (a <= z) {


            int i = 0;
            while (i < 10) {
                System.out.print((char) a  + " ");
                i++;
                a++;

            }
            System.out.println("\n");
        }


    }
}
