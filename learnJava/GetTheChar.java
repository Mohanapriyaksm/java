import java.util.Scanner;

public class GetTheChar {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String list[] = new String[s.length() - k + 1];
        System.out.println(list);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}