package ua.goit.java;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class InputTest extends TestCase {

    @Test
    public void testCheckNumber() {
        String enteredText = "30";

        int number = Input.checkNumber(enteredText);

        Assert.assertEquals(number, 30);
    }

    @Test
    public void testCheckNegativeNumber() {
        String enteredText = "-48";

        int number = Input.checkNumber(enteredText);

        Assert.assertEquals(number, -1);
    }

    @Test
    public void testCheckNumberWithoutPrimeNumbersBefore() {
        String enteredText = "2";

        int number = Input.checkNumber(enteredText);

        Assert.assertEquals(number, -1);
    }

    @Test
    public void testCheckNotNumber() {
        String enteredText = "1455F";

        int number = Input.checkNumber(enteredText);

        Assert.assertEquals(number, -1);
    }
}

