package ua.goit.java;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class InputTest extends TestCase {

    @Test
    public void testCheckNumber() {

        String enteredText = "30";
        int number = 0;

        number = Input.checkNumber(number, enteredText);

        Assert.assertEquals(number, 30);
    }
}

