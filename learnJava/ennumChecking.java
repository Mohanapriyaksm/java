enum Checking {
    check1(100), check2(200), check3(400), chec4(500), testing(1000), test2(600);

    private int price;

    private Checking(int price) {
        this.price = price;
    }

}

public class ennumChecking {
    public static void main(String args[]) {

        Checking[] c = Checking.values();

        for (Checking status : c) {
            System.out.println(status + " : " + status.ordinal());
        }
        Checking s = Checking.check3;
        System.out.println(s.getClass().getSuperclass());
        // Switch in enum

        switch (s) {
            case check1:
                System.out.println("This is Check 1");
                break;
            case check2:
                System.out.println("This is Check 2");
            case check3:
                System.out.println("This is Check 3");
            default:
                System.out.println("This is check4");
                break;
        }
    }
}
