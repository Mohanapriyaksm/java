// class MonaException extends Exception {
//     public MonaException(String str) {
//         super(str);
//     }
// }

// public class ExceptionTest {
//     public static void main(String a[]) {
//         int i = 9;
//         int j = 0;
//         int n = 0;
//         int arr[] = new int[6];
//         try {
//             j = 89 / i;
//             System.out.println(arr[8]);
//             System.out.println(arr[9]);
//             if (n == 0) {
//                 throw new MonaException("this is Custom mona Exception");
//             }
//         } catch (MonaException e) {
//             System.out.println("THis is Catch Mona Exception where n is 0");
//         } catch (ArithmeticException e) {
//             System.out.println("this is infinty Value. " + e);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Check your limit");
//         }
//         System.out.println("this is out");
//     }
// }

class MonaException extends Exception {
    public MonaException(String str) {
        super(str);
    }
}

public class ExceptionTest {
    public static void main(String a[]) {
        int i = 9;
        int j = 0;
        int n = 0;
        int arr[] = new int[6];
        try {
            j = 89 / i;
            System.out.println(arr[8]);
            System.out.println(arr[9]);
            if (n == 0) {
                throw new MonaException("Custom Mona Exception");
            }
        } catch (MonaException e) {
            System.out.println("This is Catch Mona Exception where n is 0");
        } catch (ArithmeticException e) {
            System.out.println("This is Infinity Value. " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Check your limit");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println("This is out");
    }
}
