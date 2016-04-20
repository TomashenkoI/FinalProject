package ua.goit.java;

import java.util.Scanner;

public class Input {

    public static int checkNumber(String enteredText) {
        int number = -1;
        try {
            int enteredNumber = Integer.parseInt(enteredText);
            if (enteredNumber <= 0) {
                System.out.println("Number should be more than 0");
            }
            if (enteredNumber > 0 && enteredNumber <= 2) {
                System.out.println("There is no prime numbers below " + enteredNumber);
            }
            if (enteredNumber > 2) {
                number = enteredNumber;
            }
        } catch (NumberFormatException e) {
            System.out.println("It must be a digital number!");
        }
        return number;
    }

    public static int getScanner(){
        int number = -1;
        while (number == -1) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the number:");
            String enteredText = scanner.nextLine();

            number = checkNumber(enteredText);
        }
        return  number;
    }
}