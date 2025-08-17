package Interfaces.nested;

public class A {
    // nested interface
    public interface NestedInterface{
        boolean isOdd(int num);
    }

}
class B implements A.NestedInterface{
    @Override
    public boolean isOdd(int num) {
        return (num&1)==1;
    }
}
class Main{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(7));
    }
}
// the nested interface can be declared as public private
// or protected
// but the top level interface can be declared as public or
// the default one.