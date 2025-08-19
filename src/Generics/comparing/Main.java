package Generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12,89.76f);
        Student Rahul = new Student(5,99.52f);
        Student arpit = new Student(2,95.52f);
        Student karan = new Student(13,77.52f);
        Student sachin = new Student(9,84.52f);

        Student[] list = {kunal,Rahul,arpit,karan,sachin};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks-o2.marks);
            }

        });
//        lambda expression
        Arrays.sort(list,(o1,o2)->(int)(o1.marks-o2.marks));

        if(kunal.compareTo(Rahul)<0){
            System.out.println(kunal.compareTo(Rahul));
            System.out.println("Rahul has more marks");
        }
    }
}
