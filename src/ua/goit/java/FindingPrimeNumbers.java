package ua.goit.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FindingPrimeNumbers {
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
            HashMap<Integer, Integer> list = new HashMap<>();
            ArrayList<Integer> leftNumbers = new ArrayList<>();

            SieveOfEratosthenes.numbersFiltering(number, list, leftNumbers);

            System.out.println("Prime numbers below " + number + ":");
            System.out.println(leftNumbers);
        }
        catch (NumberFormatException e) {
            System.out.println("It must be a digital number!");
        }
        }
    }
}

