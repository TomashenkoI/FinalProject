package ua.goit.java;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Input1Test extends TestCase {

    @Test
    public void testReadConsole() {

        String enteredText = "30";
        int number = 0;

        number = Input1.checkNumber(number, enteredText);

        Assert.assertEquals(number, 30);
    }
}

