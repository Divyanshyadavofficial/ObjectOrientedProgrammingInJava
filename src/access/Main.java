package access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"Div");
        // need to do a few things
        // 1. access the data members
        // 2. modify the data members
//      ArrayList<Integer>list = new ArrayList<>();
//      list.DEFAULT_CAPACITY;
        obj.getNum();
        int n = obj.num;
//        class | package | subclass(same_pkg) | subclass(diff pkg) | world(diff_pkg & not subclass)
//public      +        +            +                       +                    +
//protected   +        +            +                       +
//no modifier +        +            +
//private     +

    }
}
