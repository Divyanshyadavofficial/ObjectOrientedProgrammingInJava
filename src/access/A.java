package access;

public class A {
    protected int  num;//data hiding create a getter or setter
//  to access it.
    String name;
    int[] arr;
    // from the security point of view allowing access
    // to internal data structure or variables directly is not a
    // good convention.


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
