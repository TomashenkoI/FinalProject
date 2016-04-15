package ua.goit.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Input input = new Input();

        int number = input.checkNumber(input.readConsole());

        System.out.println(SieveOfEratosthenes.numbersFiltering(number));

    }

}
