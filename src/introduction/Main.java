package introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5  students: {roll,name,marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
//         can you provide me some sort of data structure
//         in which every single elements contain {roll,name,marks}
//         this is where object oriented programming comes...

//         A class is a named group of properties and functions
//        by convention Class starts with a capital letter.

        /* if you want to create your own data type you can
          use classes*/
//        it is basically a template
//         a class is an template of an object

//        ----objects---
//        an object is an instance of a class
//        whenever you are creating an object of a class
//        you are creating an instance of that class.
//         occupies space in the memory



//        --- new---
//        Student student1;-- it is declaring a reference to the object.
//        by default the value will be null for object
//
//        student1 = new Student();
//        this new operator it actually dynamically allocates
//        the memory at runtime and returns a reference to it.
//
//

//        ---. operator---
//        The . operator basically links the reference variable
//        student1 the object with the name of the instance variable
//        instance variables are the variables inside the
//        objects that are declared in the class outside any method
//
//        this is how it works in java hence all class
//        objects in java must be allocated dynamically

//        when you create an object of a class that class
//        is being instanciated

//        ---constructor--
//        A constructor basically defines what happens
//        when a object is being created.
//
//        --this keyword--
//
//

//        Student[] students = new Student[5];


//        System.out.println(Arrays.toString(students));
        Student kunal = new Student(15,"kunal kushwaha",85.4f);
//        kunal.rno = 13;
//        kunal.name = "kunal Kushwaha";
//        kunal.marks = 33.0f;
        System.out.println(kunal);// it will give some random value
        System.out.println(kunal.rno);// by default gives 0
        System.out.println(kunal.name);// by default give null
        System.out.println(kunal.marks);//by default 0.0

//        kunal.changeName("Div");
//        kunal.greeting();
    }
    // create a class
    // for every single student.
}
class Student{
    int rno;
    String name;
    float marks=90.0f;


    void greeting(){
        System.out.println("Hello! My name is "+this.name);
    }
    void changeName(String newName){
        this.name = newName;
    }
//        A constructor
//    example of constructor overloading
    Student(){
        this.rno = 13;
        this.name = "kunal Kushwaha";
        this.marks = 33.0f;
    }
    Student(int rno,String name,float marks){
        this.rno = 13;
        this.name = "kunal Kushwaha";
        this.marks = 33.0f;
    }
//    if here we have same variable name then use this
//    if here we use different variable names then this is not required
//    eg
//    Student(int roll,String naam,float mark){
//        rno = roll;
//        name = naam;
//        mark = marks;
//
//    }
}