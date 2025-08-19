package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(34,"kunal");
//        Human twin = new Human(kunal);
        // here the problem is we are using a another new
        // keyword and it is taking a lot of processing time
        // instead what we can do is we can use the cloning method
        //
        // object cloning means we are creating an exact copy of an
        // object clone is actually a method in object class that can
        // be used to make these copies.

        // in java there is a lang package there is an interface
        // called cloneable and we must implement that by the class
        // whose clone we need to create.

        Human twin = (Human)kunal.clone();
        System.out.println(twin.age+ " "+ twin.name);
//      now the both objects have the same values the clone
//      will copy the values from one object to the
//      other object
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        // here the arr elements in kunal will also change.
        // due to shallow copy.

        System.out.println(Arrays.toString(kunal.arr));
        twin.age = 10;
        System.out.println(kunal.age);
        System.out.println(Arrays.toString(twin.arr));


    }
}
