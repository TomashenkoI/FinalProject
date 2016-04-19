package ua.goit.java;

import java.util.Scanner;

public class Input {

    public int readConsole(){
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        while (number == -1) {
            try {
                System.out.println("Enter the number:");
                String enteredNumber = scanner.nextLine();
                number = Integer.parseInt(enteredNumber);
                if (number <= 2) {
                    System.out.println("Number should be more than 2");
                    number = -1;
                }
            } catch (NumberFormatException e) {
                System.out.println("It must be a digital number!");
            }
        }
        return number;
    }

    /*public int getNumberFromConsole() {
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        String enteredStrNumber = scanner.nextLine();
        return Integer.parseInt(enteredStrNumber);
    }*/

}