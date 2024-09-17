
//package learnJava;
/**
 *  
 */

import org.xml.sax.SAXException;

/**
 * InnerHello
 */
class student {
    int money;
    String place;
    String name;

}

class checkingString {
    int number = 1000;

    public String test(String name, String clg) {
        String convertName = name.toUpperCase();
        String convertClg = clg.toLowerCase();
        Boolean check = clg.equals(convertName);
        // System.out.println(name + clg);
        System.out.println("This is From SECOND Class");
        return " My name is " + convertName + " My Clg is " + convertClg + "" + check;
    }

    public void add(int n1, int n2) {
        System.out.println("This is from Checking Class and Object :");
        int r = n1 + n2;
        System.out.println(r);
    }
}

public class Hello {
    public static void main(String a[]) {
        int num1 = 9;
        int num2 = 89;
        int result = num1 * num2;
        System.out.println("Im learning Java");
        System.out.println(result);
        int i = 0;
        for (char c = 0; c < 126; c++) {
            i++;
            System.out.println(i + " this is the value " + c);
        }

        System.out.println("Type Casting");
        byte b = 124;
        int val = 5;
        b = (byte) val;

        System.out.println(val);
        System.out.println(b);
        String S1 = "Mohana";
        String S2 = "NGP";
        Boolean S3 = S1.equals(S2);
        System.out.println(S3);
        int j = 1;

        while (j <= 2) {
            j++;
            System.out.println(" Counting is Increasing" + j);
            int k = 0;
            while (k <= 5) {
                System.out.println("This is value of K" + k);
                k++;
            }
        }
        System.out.println("This is outside of the  loop ");
        System.out.println("Class and Object");
        checkingString object = new checkingString();
        object.add(3, 5);
        checkingString object2 = new checkingString();
        String data = object2.test(S1, S2);
        System.out.println(data);

        checkingString obj = new checkingString();
        obj.number = 78;
        System.out.println(obj.number);
        checkingString obj1 = new checkingString();
        System.out.println(obj1.number);
        int array[][] = new int[3][];

        // for (i = 0; i < 3; i++) {
        // for (j = 0; j < 3; j++) {
        // // array[i][j] = (int) (Math.random() * 100);
        // int ran = (int) (Math.random() * 100);
        // array[i][j] = ran;
        // System.out.print(array[i][j] + " ");
        // }
        // System.out.println();
        // }
        // System.out.println("next Array");
        // for (int n[] : array) {
        // for (int m : n) {
        // System.out.print(m + " ");
        // }
        // System.out.println();

        // }
        System.out.println("THIS IS jagged array");
        array[0] = new int[5];
        array[1] = new int[2];
        array[2] = new int[3];
        for (int w = 0; w < array.length; w++) {
            for (int z = 0; z < array[w].length; z++) {
                array[w][z] = (int) (Math.random() * 10);
                System.out.print(array[w][z] + " ");
            }
            System.out.println();
        }
        student s1 = new student();
        s1.name = "Mona";
        s1.place = "salem";
        s1.money = 897655;
        student s2 = new student();
        s2.name = "priya";
        s2.place = "erode";
        s2.money = 907738928;

        student students[] = new student[2];
        students[0] = s1;
        students[1] = s2;
        for (int l = 0; l < students.length; l++) {
            System.out.println("This the Students in our  class:" + students.length + " Money they gain"
                    + students[l].money + " the Student name" + students[l].name);
        }
        int numbs[] = new int[3];
        numbs[0] = 10;
        numbs[1] = 20;
        numbs[2] = 30;
        for (int n : numbs) {
            System.out.println(n);
        }
        for (student stu : students) {
            System.out.println(stu.name + ":" + stu.place + ":" + stu.money);
        }
        System.out.println("Sting Concepts:");
        String name = new String("Thenmozhi");
        System.out.println(name + ":" + name.hashCode());
        String conc = " Subramani";
        System.out.println(name.concat(conc) + " Checking Character " + name.charAt(7));
        StringBuffer sb = new StringBuffer("StringBuffer");
        System.out.println(sb.capacity() + "length" + sb.length());
        sb.append("Appending");
        System.out.println(sb);
        sb.toString();
        sb.deleteCharAt(0);
        sb.insert(0, 's');
        sb.ensureCapacity(100);

        System.out.println(sb);

    }

}