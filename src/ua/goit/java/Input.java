package ua.goit.java;

/**
 * Created by GRSV on 15.04.2016.
 */
public class Input {
    public int checkNumber(int number) {
        if (number <= 0) {
            //забыл как правильно кидаать эксепшен, потом поправлю
            return -1;
            System.err.println("Number should be more than 0");
        }
        if (number > 0 && number < 2) {
            retirn -1;
            System.err.println("There is no prime numbers below " + number);
        }
        if (number > 2) {
            try {
                return number;
            } catch (NumberFormatException e) {
                System.out.println("It must be a digital number!");
            }
        }
    }
}
