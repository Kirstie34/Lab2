package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        boolean integerRange = true;
        boolean checkInteger = true;

        System.out.println("Hello! What is your name?");
        String username = scan1.nextLine();

        System.out.println();
        System.out.println("Great! Let's continue.");
        System.out.println();

        while (integerRange) {
            System.out.println("Enter an integer between 1 and 100: ");
            System.out.println();

            System.out.println("Input: ");
            byte input1 = scan1.nextByte();

            System.out.println();

            while (checkInteger) {
                if (input1 < 1 || input1 > 100) {
                    checkInteger = true;
                    System.out.println("Not a valid integer. Try again.");
                    System.out.println();
                    break;

                } else {
                    checkInteger = false;
                }

                System.out.println();

                if ((input1 % 2) != 0) {
                    System.out.println(username + ", your output is: ");
                    System.out.println(input1 + " and Odd.");
                    System.out.println();

                } else if (input1 <= 25 && input1 >= 2) {
                    System.out.println(username + ", your output is: ");
                    System.out.println("Even and less than 25.");
                    System.out.println();

                } else if (input1 <= 60 && input1 >= 26) {
                    System.out.println(username + ", your output is: ");
                    System.out.println("Even.");
                    System.out.println();

                } else if (input1 > 60) {
                    System.out.println(username + ", your output is: ");
                    System.out.println(input1 + " and Even.");
                    System.out.println();

                }

                System.out.println();

                System.out.print(username + ", would you like to continue? (y/n): ");
                char yN = scan1.next().charAt(0);

                System.out.println();

                if (yN == 'y') {
                    integerRange = true;
                } else {
                    integerRange = false;
                    System.out.println("Bye!");


                }
            }
        }
    }
}
