package Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4,7,8);
//        System.out.println(box1.l+" "+box1.w+" "+box1.h);
//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.l+" "+box3.w+" "+box3.h+" "+ box3.weight);
//        BoxWeight box4 = new BoxWeight(1,2,3,4);

        Box box5 = new BoxWeight(2,3,4,8);
        System.out.println(box5.w);
        System.out.println(box5);
//      there are many variables in both parent and child classes
//      you are given access to variables that are in  the ref type i.e. BoxWeight
//      hence you should have access to weight variable
//      this also means that ones you are trying to access should be initialised
//      but here,when the obj itself is of type parent class, you will you
//      call the constructor of child class
//      hence this is giving an error
//        BoxWeight box6 = new Box(2,3,4);
    }
}
