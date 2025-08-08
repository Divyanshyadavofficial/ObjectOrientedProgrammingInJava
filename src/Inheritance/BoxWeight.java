package Inheritance;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);// call the parent class constructor
//      used to initialise values present in parent class
//      although a subclass can access the variables that are declared
//      in parent class
        this.weight = weight;
    }
}
