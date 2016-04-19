package ua.goit.java;

public class Main {
    public static void main(String[] args) {

        Input1 input1 = new Input1();

        int number = input1.getScanner();

        SimpleNumbers sieveOfEratosthenes = new SieveOfEratosthenes();

        System.out.println(sieveOfEratosthenes.numbersFiltering(number));
    }
}
