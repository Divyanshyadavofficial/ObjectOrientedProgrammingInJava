package access;

public class ObjectDemo {
    int num;
    float gpa ;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa ;
    }
    // we will go in details of how to create it in hashmap lecture
    // it basically gives a unique number representation of an object
    @Override
    public int hashCode() {
        return super.hashCode();
        // return num;
        // now it will return the num that is passed to
        // the object.
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
// already covered
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(12,56.8f);
        ObjectDemo obj2 = new ObjectDemo(12,89.0f);
        if(obj == obj2){
            System.out.println("obj is equal obj2");
        }
        if(obj.equals( obj2)){
            System.out.println("obj is equal to obj2");
        }
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj.getClass());
    }

}
