package Abstract;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(34);
        son.career();
//        Daughter daughter = new Daughter(28);
//        daughter.career();
        Parent.hello();
        son.normal();
//        Parent mom = new Parent(); you cannot create objects
//        of abstract class.
//
        Parent daughter = new Daughter(28);
        daughter.career();
        // as we can't create objects of parent class
        // but we can use it like this
    }
}
