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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        String enteredNumber = scanner.nextLine();

        Input input = new Input();
        try {

            return input.checkNumber(Integer.parseInt(enteredNumber));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("It must be a digital number!");
        }
    }

}
