package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // here list is a parent interface and arraylist class
        // implements it.
        List<Integer> list2 = new LinkedList<>();

        list.add(78);
        list2.add(34);
        list.add(89);
        list2.add(23);
        System.out.println(list2);


//        vector example

        List<Integer> vector = new Vector<>();

        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(56);

        System.out.println(vector);
    }
}
