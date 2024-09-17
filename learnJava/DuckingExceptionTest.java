
// class DuckingExceptionTest {
//     int mask = 0x000F;
// int value = 0x2222;
// ///* System.out.println(result);*/ 
// }

// =======
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;
// class Shape{
//     int length;
//     int breath;
//   public Shape(int length, int breath){
//       this.length = length;
//       this.breath = breath;
//   }
//   public void area(){
//       System.out.println("Length:" + length +"Breath:" +breath);
//   }
// }

// class Rectangle extends Shape{
//     public Rectangle(int length,int breath){
//         super(length, breath);
//     }
//     public void area(){
//         System.out.println(length+" "+breath);
//         System.out.println((length*breath));
//     }
// }
// public class Solution {
//     public static void main(String args[] ) throws Exception {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT */
//         Rectangle a = new Rectangle(4,5);
//         Scanner sc = new Scanner(System.in);
//         //a.area();
//         a.area();
//     }
// }

// --------------------------
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// class Shape {
//     public int length , breadth ;
//     public Shape( int length , int breadth ) {
//         this.length = length ;
//         this.breadth = breadth ;
//     }
//     public void area() {
//         System.out.print(length + " " + breadth);
//     }
// }

// class Rectangle extends Shape {
//     Rectangle(int l , int b) {
//         super(l,b);
//     }
//     @Override
//     public void area() {
//         System.out.print("\n" + length*breadth);
//     }
// }

// public class Solution {
//     public static void main(String args[] ) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int l = sc.nextInt();
//         int b = sc.nextInt();

//         Shape shape = new Shape(l,b);
//         shape.area();

//         Shape rectangle = new Rectangle(l,b);
//         rectangle.area();
//     }
// }
import java.util.Scanner;

public class DuckingExceptionTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        System.out.println(A.compareToIgnoreCase(B) > 0 ? "Yes" : "No");
        System.out.println(toInitCap(A) + " " + toInitCap(B));
        sc.close();
    }

    public static String toInitCap(String str) {
        return str == null || str.length() == 0 ? "" : str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}