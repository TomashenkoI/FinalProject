package ua.goit.java;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SieveOfEratosthenes implements SimpleNumbers{

    public List<Integer> numbersFiltering(int number) {

        HashMap<Integer, Integer> list = new HashMap<>();
        ArrayList<Integer> leftNumbers = new ArrayList<>();

        for (int i = 2; i < number+1; i++) {
            list.put(i, i);
        }

        for (int i = 2; i * i < number; i++) {
            for (int y = 1; y*i <= number; y++) {
                int a = i * y;
                int b = i + a;
                list.remove(b);
            }
        }

        for (int i = 0; i < number; i++) {
            if (list.get(i) != null) {
                leftNumbers.add(list.get(i));
            }
        }
        return leftNumbers;
    }
}

