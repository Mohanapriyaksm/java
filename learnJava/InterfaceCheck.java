abstract class Computer {
    public abstract void code();
}

class Laptop extends Computer {

    public void code() {
        System.out.println("I can run / Calculate .....LAPTOP");
    }
}

class Desktop extends Computer {
    public void code() {
        System.out.println("Iam also code , more faster............DESKTOP");
    }
}

class Developer {
    public void dev(Computer lap) {
        lap.code();
        // System.out.println("Im will code");
    }

    public void code(String str) {
        System.out.println(str.toUpperCase());
    }
}

public class InterfaceCheck {
    public static void main(String args[]) {
        Computer des = new Desktop();
        Computer lap = new Laptop();
        Developer devloper = new Developer();
        devloper.dev(lap);
        devloper.dev(des);
        devloper.code("java programming");
    }

}
