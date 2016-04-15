package ua.goit.java;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by Grigoriy on 15.04.2016.
 */
public class InputTest extends TestCase {
    /*Input input = new Input();
    Input spy =  spy(Input);
    when(spy.getScanner()).thenReturn();*/
    String data = "-7";
    InputStream stdin = System.in;

   @Test
    public void testReadConsole() {
       System.setIn(new ByteArrayInputStream(data.getBytes()));
       Scanner scanner = new Scanner(System.in);
       System.out.println(scanner.nextLine());

   }

}
