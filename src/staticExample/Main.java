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
        greeting();

    }
    static void greeting(){
        System.out.println("Hello World");
    }
}
