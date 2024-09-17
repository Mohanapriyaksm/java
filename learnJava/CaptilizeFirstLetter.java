import java.io.*;
import java.util.*;

public class CaptilizeFirstLetter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String A1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String B1 = B.substring(0, 1).toUpperCase() + B.substring(1);
        // String res = ? "No" : "Yes";
        String result = A.compareTo(B) == 0 || (A.length() > B.length()) ? "No" : "Yes";

        // System.out.println("No"):System.out.println("Yes");

        System.out.println(A.length() + B.length());
        System.out.println(result);
        System.out.println(A1 + " " + B1);
    }
}
