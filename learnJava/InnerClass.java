/**
 * InnerInnerClass
 */
class OuterClass {
    public void display() {
        System.out.println("Outer Class");
    }

    class InnerInnerClass {
        public void display() {
            System.out.println("Inner Class");
        }
    }

}

abstract class A {
    abstract void abstractMethod();
}

public class InnerClass {
    public static void main(String a[]) {
        OuterClass obj = new OuterClass() {
            public void display() {
                System.out.println("This is new Anonymous Class");
            }
        };
        obj.display();

        OuterClass.InnerInnerClass obj1 = obj.new InnerInnerClass();
        obj1.display();
        A objA = new A() {
            void abstractMethod() {
                System.out.println("Abstract and Anonymous Method");
            }
        };

        objA.abstractMethod();
    }

}
