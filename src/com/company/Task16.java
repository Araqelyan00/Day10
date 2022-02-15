package com.company;

import java.util.Random;
import java.util.Scanner;

/*
Write a program that generates a random number and asks the user
to guess what the number is. If the user’s guess is higher than the
random number, the program should display Too high, try again. If the
user’s guess is lower than the random number, the program should
display Too low, try again. If you find the number print Yes, you
guessed the number.The program should use a loop that repeats
until the user correctly guesses the random number.
*/
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(20);
        int userNumber;
        while (true) {
            userNumber = scanner.nextInt();
            if (userNumber < number) {
                System.out.println("Too low,try again");
            } else if (userNumber > number) {
                System.out.println("Too high,try again");
            } else {
                System.out.println("Yes, you guessed the number.");
                break;
            }
        }
    }
}
