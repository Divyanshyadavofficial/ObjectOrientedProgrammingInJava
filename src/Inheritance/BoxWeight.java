package Inheritance;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight = -1;
    }

    static void greeting(){
        System.out.println("Hey, I am in boxweight class greetings");
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }
//  it is exactly equal to Box box5 = new BoxWeight(2,3,4);
//  what is accessed is based on the type of
//  reference variable not the type of object.
    BoxWeight(double side,double weight){
        super(side);
        this.weight = weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {

        super(l, h, w);// call the parent class constructor
//      here child class does care about what parent class
//      contains that is why it is like this
//      used to initialise values present in parent class
//      although a subclass can access the variables that are declared
//      in parent class
//      if we are not using it like this then the default constructor
//      of the parent class will be called
//
        this.weight = weight;
        System.out.println(super.weight);


    }
}
