
interface A {
    void run(int i, String str);
}

// class B implements A {
// public void run() {
// System.out.println("This is B from A");
// }
// }

public class LamdaExpression {
    public static void main(String args[]) {
        A obj = (i, str) -> {
            System.out.println("This is one from FunctionalInterface " + i + str);
        };
        obj.run(6, "Mona");

    }
}
