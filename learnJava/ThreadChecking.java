// class A extends Thread {
//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("A");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B extends Thread {
//     public void run() {
//         for (int i = 0; i < 100; i++) {

//             System.out.println("B");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class ThreadChecking {
    public static void main(String Args[]) {
        Runnable a = () -> {

            for (int i = 0; i < 100; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        };
        Runnable b = () -> {
            for (int i = 0; i < 100; i++) {

                System.out.println("B");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();

    }
}
