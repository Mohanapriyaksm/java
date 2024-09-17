/**
 * 
 */
class phone {
    String brand;
    int cost;
    int memory;

    public phone() { // Default Constructor
        cost = 12345678;
        brand = "Iphone Bro";
        memory = 738;
        System.out.println("in Default Constructor");
    }

    public phone(int cost, String brand, int memory) { // Parameterized Constructor
        this.cost = cost;
        this.brand = brand;
        this.memory = memory;
        System.out.println("in Constructor Overriding");
    }

    public int getAge() {
        return cost;
    }

    public void setAge(int cost) {
        System.out.println("Set Cost is CALLED");
        this.cost = cost;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    static {
        System.out.println("in static Block");
    }

    public void phone1() {
        System.out.println("This is new Model Phone " + brand + "Its cost is " + cost + "Dollar");
    }

    public static void phone2(phone obj) {
        System.out.println("This is new Model Phone " + obj.brand + "Its cost is " + obj.cost + "Dollar ");
        System.out.println("This is from Static Method");
    }

    @Override
    public String toString() {
        return "{" +
                " brand='" + getBrand() + "'" +
                ", cost='" + cost + "'" +
                ", memory='" + memory + "'" +
                "}";
    }

}

class A {

    public A() {
        System.out.println(" A Constructor");
    }

    public A(int n) {
        System.out.println(" A Paramerterized");
    }

    public void show() {
        System.out.println("Show method from Class A");
    }
}

class B extends A {
    public B() {
        System.out.println(" B Constructor");
    }

    public B(int n) {
        super(n);
        System.out.println(" B paramerterized");
    }

    public void show() {
        System.out.println("Show Method from class B");
    }

    class checkingInnerClass {
        public void CheckingInnerClassMethod() {
            System.out.println("This is From Inner Class");
        }
    }

    // public B.checkingInnerClass checkingInnerClass() {
    // return null;
    // }
}

class Cal {
    public Cal() {
        System.out.println("This is from Cal");
    }

    public void anonymousInnerClass() {
        System.out.println("Anonymous Inner Class");
    }
}

public class Demo {
    public static void main(String a[]) {
        phone obj = new phone(); // Default Constructor
        phone obj1 = new phone(290, "Samsung", 89); // Parametearized Constructor
        System.out.println(obj);
        System.out.println(obj1);
        B b = new B(7);
        // obj.phone1();
        // phone.phone2(obj);
        // System.out.println("LEARNING:" + obj.getBrand() + ":" + obj.getAge());
        // obj.setAge(90);
        // // System.out.println("this is Getter " + obj.getBrand() + ":" +
        // obj.getAge());
        new Cal();
        System.out.println("This is from Dynamic Class:");
        A object1 = new A();
        object1.show();
        object1 = new B();
        object1.show();
        int num = 7;
        Integer num1 = num;
        System.out.println("Autoboxing:" + num1);
        int num2 = num1;
        System.out.println("auto-unboxing" + num2);
        String str = "15";
        int stringToInt = Integer.parseInt(str);
        System.out.println("Converting Int to String" + stringToInt);
        B aClassObject = new B();
        aClassObject.show();
        B.checkingInnerClass Object = aClassObject.new checkingInnerClass();
        Object.CheckingInnerClassMethod();

    }

}
