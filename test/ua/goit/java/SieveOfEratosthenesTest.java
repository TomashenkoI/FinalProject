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
    public void testNumbersFilteringBelowNumber30() throws Exception {
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

    @Test
    public void testNumbersFilteringBelowNumber100() throws Exception {
        SimpleNumbers sieveOfEratosthenes = new SieveOfEratosthenes();

        List<Integer> primeNumbersBelow100 = new ArrayList<>();
        primeNumbersBelow100.add(2);
        primeNumbersBelow100.add(3);
        primeNumbersBelow100.add(5);
        primeNumbersBelow100.add(7);
        primeNumbersBelow100.add(11);
        primeNumbersBelow100.add(13);
        primeNumbersBelow100.add(17);
        primeNumbersBelow100.add(19);
        primeNumbersBelow100.add(23);
        primeNumbersBelow100.add(29);
        primeNumbersBelow100.add(31);
        primeNumbersBelow100.add(37);
        primeNumbersBelow100.add(41);
        primeNumbersBelow100.add(43);
        primeNumbersBelow100.add(47);
        primeNumbersBelow100.add(53);
        primeNumbersBelow100.add(59);
        primeNumbersBelow100.add(61);
        primeNumbersBelow100.add(67);
        primeNumbersBelow100.add(71);
        primeNumbersBelow100.add(73);
        primeNumbersBelow100.add(79);
        primeNumbersBelow100.add(83);
        primeNumbersBelow100.add(89);
        primeNumbersBelow100.add(97);

        Assert.assertEquals(sieveOfEratosthenes.numbersFiltering(100), primeNumbersBelow100);
    }
}
