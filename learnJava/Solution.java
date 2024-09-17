// // // // Print the String along with number and append  "0" if the number is in 2 digit

// // // import java.util.Scanner;

// // // public class Solution {

// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //         System.out.println("================================");

// // //         // Read input until no more input is provided
// // //         while (sc.hasNext()) {
// // //             String str = sc.next();
// // //             int val = sc.nextInt();

// // //             // Format and print the output
// // //             System.out.printf("%-15s%02d%n", str, val);
// // //         }

// // //         System.out.println("================================");
// // //     }
// // // }

// // import java.io.*;

// // import java.math.*;
// // import java.security.*;
// // import java.text.*;
// // import java.util.*;
// // import java.util.concurrent.*;
// // import java.util.function.*;
// // import java.util.regex.*;
// // import java.util.stream.*;
// // import static java.util.stream.Collectors.joining;
// // import static java.util.stream.Collectors.toList;

// // class Result {

// //     /*
// //      * Complete the 'fizzBuzz' function below.
// //      *
// //      * The function accepts INTEGER n as parameter.
// //      */

// //     public static void fizzBuzz(int n) {
// //         // Scanner sc = new Scanner(System.in);
// //         // int total = sc.nextInt();
// //         for (int i = 0; i <= n; i++) {
// //             if (i % 3 == 0 && i % 5 == 0) {
// //                 System.out.println("FizzBuzz");
// //             } else if (i % 3 == 0 && i % 5 != 0) {
// //                 System.out.println("Fizz");
// //             } else if (i % 5 == 0 && i % 3 != 0) {
// //                 System.out.println("Buzz");
// //             } else
// //                 System.out.println(i);
// //         }
// //     }

// // }

// // public class Solution {
// //     public static void main(String[] args) throws IOException {
// //         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

// //         int n = Integer.parseInt(bufferedReader.readLine().trim());

// //         Result.fizzBuzz(n);

// //         bufferedReader.close();
// //     }
// // }
// import java.util.Scanner;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int n = scanner.nextInt();
//         int[] arr = new int[n];

//         // Input array elements
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         // Call the countOccurrences method and print the result
//         int result = countOccurrences(arr);
//         System.out.println(result);

//         scanner.close();
//     }

//     // Function to count the occurrences of the maximum element in the array
//     static int countOccurrences(int[] arr) {
//         int max = arr[0];
//         int count = 1;

//         // Find the maximum element in the array
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//                 count = 1;
//             } else if (arr[i] == max) {
//                 count++;
//             }
//         }

//         return count;
//     }
// }



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    class TableTest
{
   public void table(int N){
       for(int i=1;i<10;i++){
           System.out.println(N + "x" +i + "="+N*i );
       }
   } 
}    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        TableTest test = new TableTest();
        table(2);
        bufferedReader.close();
    }
private static void table(int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'table'");
}
}
