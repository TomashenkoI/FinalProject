package ua.goit.java;

import java.util.Scanner;

public class Input1 {

    public static int checkNumber(int number, String enteredText) {
            try {
                int enteredNumber = Integer.parseInt(enteredText);
                if (enteredNumber <= 2) {
                    System.out.println("Number should be more than 2");
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

            number = checkNumber(number, enteredText);
        }
        return  number;
    }
}
