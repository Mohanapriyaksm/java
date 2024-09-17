
interface A {
    void run();
}

class B implements A {
    public void run() {
        System.out.println("This is B from A");
    }
}

public class FunctionalInterface {
    public static void main(String args[]) {
        B obj = new B() {
            public void run() {
                System.out.println("Checking::This is one from FunctionalInterface");
            }
        };
        obj.run();

    }
}
