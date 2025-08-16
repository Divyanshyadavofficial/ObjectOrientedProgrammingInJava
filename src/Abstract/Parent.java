package Abstract;

public abstract class Parent {
    public Parent(int age) {
        this.age = age;
    }
//    abstract Parent(){};
//    we cannot create abstract constructors
//    we cannot create abstract static methods

    int age;
    static void hello(){
        System.out.println("hey");
    }
//    we can create static methods in abstract classes.
    void normal(){
        System.out.println("this is a normal method");
    }
//    we can create normal methods
    abstract void career();
    abstract void partner();
}
