package Polymorphism;

public class Numbers {
    double sum(double a,int b){
        return  a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2,3);
        obj.sum(1,2,3);
    }
}
// here at compile time it will know which method to run
// according to the arguments passed to the function call
// this is compile time polymorphism