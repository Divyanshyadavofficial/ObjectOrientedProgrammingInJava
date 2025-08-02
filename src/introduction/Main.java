package introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // ------------------ ARRAYS ------------------
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5  students: {roll,name,marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // can you provide me some sort of data structure
        // in which every single element contains {roll,name,marks}
        // this is where object oriented programming comes...

        // ------------------ OBJECT ORIENTED PROGRAMMING ------------------

        // A class is a named group of properties and functions
        // by convention Class starts with a capital letter.

        // If you want to create your own data type you can use classes
        // it is basically a template
        // a class is a template of an object

        // ------------------ OBJECTS ------------------

        // An object is an instance of a class.
        // Whenever you are creating an object of a class
        // you are creating an instance of that class.
        // It occupies space in the memory.

        // Student student1; -- declaring a reference to the object.
        // By default the value will be null for object

        // student1 = new Student();
        // The `new` operator dynamically allocates memory at runtime
        // and returns a reference to it.

        // The `.` operator links the reference variable (e.g., student1)
        // to the object's instance variables.

        // All class objects in Java must be allocated dynamically.
        // When you create an object of a class, that class is being instantiated.

        // ------------------ CONSTRUCTOR ------------------

        // A constructor defines what happens when an object is created.

        // ------------------ DEMO OBJECT ------------------
        Student kunal = new Student(15, "kunal kushwaha", 85.4f);
//        kunal.rno = 13;
//        kunal.name = "kunal Kushwaha";
//        kunal.marks = 33.0f;

        System.out.println(kunal);          // it will give some random value (reference string)
        System.out.println(kunal.rno);      // prints: 13 (set in constructor)
        System.out.println(kunal.name);     // prints: kunal Kushwaha
        System.out.println(kunal.marks);    // prints: 33.0

//        kunal.changeName("Div");
//        kunal.greeting();

        Student random = new Student(kunal);
        System.out.println(random.name);    // prints kunal Kushwaha (copied from kunal)
        Student random2 = new Student();
        System.out.println(random2.name);
        Student one = new Student();
        Student two = one;
        one.name = "Something Something";
        System.out.println(two.name);
        A obj = new A("sssssd");
        System.out.println(obj);// it will display some hash value

    }
}

// ------------------ CLASS DEFINITION ------------------

class Student {
    int rno;
    String name;
    float marks = 90.0f;

    // ------------------ INSTANCE METHODS ------------------

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String newName) {
        this.name = newName;
    }

    // ------------------ COPY CONSTRUCTOR ------------------

    Student(Student other) {
        this.name = other.name;
    }

    // ------------------ DEFAULT CONSTRUCTOR ------------------

    Student() {
        // this is how you call a constructor from another
        // another constructor
        // internally: new Student();
        this(13,"default person",100.0f);
    }

    // ------------------ PARAMETERIZED CONSTRUCTOR ------------------

    // Student arpit = new Student(17,"Arpit",89.7f);
    // here, this will be replaced with arpit

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // Note:
    // If here we have same variable name then use `this`
    // If we use different variable names then `this` is not required

    /*
    Example:
    Student(int roll, String naam, float mark){
        rno = roll;
        name = naam;
        marks = mark;
    }
    */
}
