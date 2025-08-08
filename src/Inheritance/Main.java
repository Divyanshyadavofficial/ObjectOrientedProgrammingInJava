package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4,7,8);
        System.out.println(box1.l+" "+box1.w+" "+box1.h);
        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.l+" "+box3.w+" "+box3.h+" "+ box3.weight);
        BoxWeight box4 = new BoxWeight(1,2,3,4);
    }
}
