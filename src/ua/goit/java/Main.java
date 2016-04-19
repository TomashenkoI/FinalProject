package ua.goit.java;

public class Main {
    public static void main(String[] args) {
        int number = Input.getScanner();

        SimpleNumbers sieveOfEratosthenes = new SieveOfEratosthenes();

        System.out.println(sieveOfEratosthenes.numbersFiltering(number));
    }
}
