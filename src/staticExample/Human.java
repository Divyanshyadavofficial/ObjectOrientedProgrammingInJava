package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
//    the properties that are not related to objects
//    but are common to all the objects we declare those as
//    static
    public Human(int age,String name,int salary,boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
//      this.population+=1;
//      Here population is used as an instance variable
//      here we don't need to use this variable because
//      population is a static variable
//      in order to access the static variable defined in the
//      class we need to use className
        Human.population+=1;
        // this is the convention
//        this.population+=1 --> this will also work.

    }
}
