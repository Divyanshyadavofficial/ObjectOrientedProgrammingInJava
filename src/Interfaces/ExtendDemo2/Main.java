package Interfaces.ExtendDemo2;

public class Main implements A, B {
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();// call via the interface name
    }

//    @Override
//    public void fun() {
//
//    }
}
