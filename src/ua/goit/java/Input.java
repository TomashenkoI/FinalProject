package ua.goit.java;

import java.util.Scanner;

/**
 * Created by GRSV on 15.04.2016.
 */
public class Input {
    public int checkNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number should be more than 0");
        }
        if (number > 0 && number < 2) {
            throw new IllegalArgumentException("There is no prime numbers below " + number);
        }
        if (number > 2) {
            try {
                return number;
            } catch (NumberFormatException e) {

                throw new IllegalArgumentException("It must be a digital number!");
            }

        }

        throw new IllegalArgumentException("It must be a digital number!");
    }

    public int readConsole(){
        Scanner scanner = getScanner();
        int number = -1;

        Input input = new Input();
        while (number == -1) {
            try {
                System.out.println("Enter the number:");
                String enteredNumber = scanner.nextLine();
                number = Integer.parseInt(enteredNumber);
                if (number < 2) {
                    System.out.println("Number should be more than 2");
                    number = -1;
                }
            } catch (NumberFormatException e) {
                System.out.println("It must be a digital number!");
            }
        }
        return number;
    }

    public Scanner getScanner(){
        return new Scanner(System.in);
    }

}
