package ua.goit.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        String enteredNumber = scanner.nextLine();

        Input input = new Input();

        int number = input.checkNumber(Integer.parseInt(enteredNumber));

        if (number > 0) {
            System.out.println(SieveOfEratosthenes.numbersFiltering(number));
        }
        else {
            System.out.println("Error!");
        }

        }
    }


