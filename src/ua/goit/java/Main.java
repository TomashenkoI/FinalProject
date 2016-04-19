package ua.goit.java;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();

        int number = input.getScanner();

        SimpleNumbers sieveOfEratosthenes = new SieveOfEratosthenes();

        System.out.println(sieveOfEratosthenes.numbersFiltering(number));
    }
}
