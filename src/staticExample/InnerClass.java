package staticExample;
/* a outside class cannot be static
*  only inner classes cannot be static
*  because it is itself does not dependent on any other class
*  hence test class can be static */
public class InnerClass {
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("kunal");
        Test b = new Test("Rahul");
//      here error because this class test itself is dependent on
//      the outer class so where is the object of that class.
//      then declare the inner class as static.
//      to use this class test we define it as static
//      whenever we are talking about the static context we are
//      talking about where this is mentioned as static
//      hence the class test is not dependent on the objects of
//      inner class
//      but these two name and test they can have instances of each other.

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
