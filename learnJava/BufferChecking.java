import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferChecking {
    public static void main(String a[]) {

        try (// InputStreamReader st = new InputStreamReader(System.in);
             // BufferedReader bf = new BufferedReader(st);
                Scanner sc = new Scanner(System.in)) {
            System.out.println("Number Please");
            int num = sc.nextInt();
            sc.nextLine();
            System.out.println(num);
            System.out.println("Stirng");
            String str = sc.nextLine();

            // Scanner s = new Scanner(System.in);

            System.out.println("U have entered " + str);
            System.out.println(str);
        }

    }
}