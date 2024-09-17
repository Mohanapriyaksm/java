// class - class ->extends
//interface - interface -> extends
// class - interface -> Implements
interface A {
    void config();

    void lead(); // Interface need to be override the methods or will get the error

    int area = 78;
}

class B extends Testing implements A, X {
    public void config() {
        System.out.println("This is from Config Method");
    }

    public void lead() {
        System.out.println("This is Lead Method");
    }

    public void run() {
        System.out.println("I'm running");
    }
}

interface X {
    void run();
}

interface Y extends X {

}

class Testing {
    public void test() {
        System.out.println("Just Testing");
    }
}

public class Interface {
    public static void main(String arg[]) {
        Testing test = new Testing();
        A obj;
        obj = new B();
        X obj1;
        obj1 = new B();

        obj.config();
        obj.lead();
        obj1.run();
        test.test();

        // A.area = 9
        // It will produce the error because The values inside the interface is always
        // finial and static

    }
}