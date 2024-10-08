import java.io.*;
import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(String A) {
        int i = 0, j = A.length() - 1;

        while (i < j) {
            if (A.charAt(i) != A.charAt(j))
                return false;
            i++;
            j++;

        }
        return true;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if (isPalindrome(A))
            System.out.println("Yes");
        else
            System.out.println("No");
    }


}
