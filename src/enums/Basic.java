package enums;

public class Basic  {
    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are enum constants
        // public, static and final
        // since its final you can't create child enums
        // type is week
        // all the enums extends the java.lang.enum class.
        Week(){
            System.out.println("constructor called for "+this);
        }
        // enum can implement as many interfaces as it can.
        // but it will not be able to extend classes.
        // other than the java.lang.enum class
        @Override
        public void hello() {
            System.out.println("hello how are you");
        }
        // abstract are not allowed in enums.


        // this is not public or protected, only private and default
        // why? we don't want to create new objects.
        // this  is not the enum concept

        // internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
//        for(Week day: Week.values()){
//            System.out.println(day);
//        }
        System.out.println(week.ordinal());
        week.hello();
        // it will return the enum constant.
        System.out.println(Week.valueOf("Monday"));


    }
}
