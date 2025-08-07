package staticExample;
// if files are in the same folder you don't have to put the
// import statement.
public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22,"Kunal Kushwaha",10000,false);
        Human rahul = new Human(34,"Rahul",10000,true);
        Human arpit = new Human(34,"Arpit",10000,true);


        System.out.println(kunal.name);
        System.out.println(kunal.population);
//        this will work but use class name to access
//        declare or modify static variable.
        System.out.println(Human.population);
        System.out.println(Human.population);
        //greeting();// a non static method this will raise error
//        that you cannot define a non static member inside static
        Main funn = new Main();
        funn.fun2();

    }
    // we know that something is not static, belongs to an object.

//    this is not dependent on objects
    static void fun(){

        //greeting();// you can't use this because it requires
//        an instance but the function you are using it in
//        does not depend on objects

//      you cannot access non static stuff without referencing
//      their instances in a static context
//
//      hence,here i am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }

    void greeting(){
        fun();
        System.out.println("Hello World");
    }


}
