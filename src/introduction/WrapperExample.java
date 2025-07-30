package introduction;

public class WrapperExample {
    public static void main(String[] args) {

        // ------------------ PRIMITIVES VS WRAPPER ------------------
        int a = 10;
        int b = 20;

        Integer num = 45; // now it will be created like an object (autoboxing)

        swap(a, b);
        // Output: 10 20 because Java is pass-by-value (even for primitives)
        System.out.println(a + " " + b);

        // ------------------ FINAL KEYWORD ------------------
        final int BONUS = 2;
        // BONUS = 2; // ❌ Error: cannot assign a value to final variable

        // Final with non-primitives (reference cannot be changed, but object can be modified)
        final A kunal = new A("kunal");
        kunal.name = "other name"; // ✅ allowed: changing internal state

        // kunal = new A("new object"); // ❌ Error: final reference can't be reassigned

        // ------------------ GARBAGE COLLECTION ------------------
        A obj;
        for (int i = 0; i < 100000000; i++) {
            obj = new A("Random name"); // eligible for GC in each iteration
        }
        // Finalize method will be called by JVM (non-deterministically) before GC
    }

    // ------------------ SWAP FUNCTION ------------------
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

// ------------------ CLASS A ------------------

class A {
    // Final field must be initialized
    final int num = 10;

    String name;

    public A(String name) {
        this.name = name;
    }

    // finalize() is called before GC (not reliable for critical cleanup)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
