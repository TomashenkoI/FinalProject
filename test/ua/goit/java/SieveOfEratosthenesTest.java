package ua.goit.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 7 on 18.04.2016.
 */
public class SieveOfEratosthenesTest {

    @Test
    public void testNumbersFiltering() throws Exception {
        SimpleNumbers sieveOfEratosthenes = new SieveOfEratosthenes();

        List<Integer> primeNumbersBelow30 = new ArrayList<>();
        primeNumbersBelow30.add(2);
        primeNumbersBelow30.add(3);
        primeNumbersBelow30.add(5);
        primeNumbersBelow30.add(7);
        primeNumbersBelow30.add(11);
        primeNumbersBelow30.add(13);
        primeNumbersBelow30.add(17);
        primeNumbersBelow30.add(19);
        primeNumbersBelow30.add(23);
        primeNumbersBelow30.add(29);

        Assert.assertEquals(sieveOfEratosthenes.numbersFiltering(30), primeNumbersBelow30);
    }
}