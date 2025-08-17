package Interfaces.ExtendDemo2;

public interface A {

    static  void greeting(){
        System.out.println("I am a static method");
    }

     default void fun(){
         System.out.println("I am in A");
     };
}
