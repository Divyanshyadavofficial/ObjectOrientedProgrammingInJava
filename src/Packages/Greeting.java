package Packages;
// whenever you are writing a file you have to mention
// in which package the file lies


import static Packages.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello");
        message();

//        package is defined as container for classes used
//        to keep class names in compartments
//        In simple terms a package is just a folder
//        Now the concerns that the names of classes will
//        collide that are stored elsewhere are gone
//        packages are stored in a hierarical method
//        it is used for naming and visiblity control
    }
}
