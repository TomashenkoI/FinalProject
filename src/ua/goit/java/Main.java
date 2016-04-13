package ua.goit.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        String enteredNumber = scanner.nextLine();
        int number = Integer.parseInt(enteredNumber);

        if (number <= 0) {
            System.out.println("Number should be more than 0");
        }
        if (number > 0 && number < 2) {
            System.out.println("There is no prime numbers below " + number);
        }
        if (number > 2) {
        try {
            System.out.println("Prime numbers below " + number + ":");
            System.out.println(SieveOfEratosthenes.numbersFiltering(number));
        }
        catch (NumberFormatException e) {
            System.out.println("It must be a digital number!");
        }
        }
    }
}

