package staticExample;
// this is demo to show initialisation of static variables
// you have some static variables we want to initialise
// we want some to work to initialise this
// we can do this by using static block and this static
// block is executed when the class is first loaded

public class StaticInt {
    static int a = 4;
    static int b;
//    will only run once, when the first obj is created
//    i.e. when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a+" "+StaticInt.b);

        StaticInt.b+=3;

        System.out.println(StaticInt.a+" "+StaticInt.b);

        StaticInt obj2 = new StaticInt();
        System.out.println(StaticInt.a+" "+StaticInt.b);

    }

}
