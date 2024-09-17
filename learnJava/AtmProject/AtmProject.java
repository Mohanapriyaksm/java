// package AtmProject;

// public package AtmProject;

import java.util.*;

class AtmProject {
    public static void main(String a[]) {
        String name;
        int password = 1234;
        int balance = 1000;
        int takeAmount = 0;
        int addAmount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Pin");
        int pin = sc.nextInt();
        if (password == pin) {
            while (true) {
                System.out.println("Press 1 to Check your Balance");
                System.out.println("Press 2 to Change the Password");
                System.out.println("Press 3 to Debit the amount");
                System.out.println("Press 4 to Credit the amount");
                System.out.println("Press 5 to take the recepit");
                System.out.println("Press 6 to Exit");
                int opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("U have pressed 1 , ur balance is " + balance);
                        break;
                    case 2:
                        System.out.println("You have pressed 2, to change the password.");

                        System.out.println("Please confirm with 'yes' to proceed");
                        String confirmation = sc.next();
                        if (confirmation.contains("yes")) {
                            System.out.println("Please set the Pin number here ");
                            int changepassword = sc.nextInt();
                            changepassword = password;
                            changepassword = pin;
                        }

                        break;
                    case 3:
                        System.out.println("u have pressed 3 please provide the amount to Credit/Add Amount");
                        addAmount = sc.nextInt();
                        balance = balance + addAmount;
                        break;
                    case 4:
                        System.out.println("u have pressed 4 , to take amount amount");
                        takeAmount = sc.nextInt();
                        if (balance > takeAmount)
                            balance = balance - takeAmount;
                        else
                            System.out.println("u have insufficient balance");
                        break;
                    case 5:
                        System.out.println("------------------");
                        System.out.println("u have pressed 5 to take the recepit");
                        System.out.println("HERE IS YOUR RECEIPT");
                        System.out.println("Your Available Balance : " + balance);
                        System.out.println("Credited Amount : " + addAmount);
                        System.out.println("Debited Amount" + takeAmount);
                        System.out.println("Thanks for Comming" + pin + "password" + password);
                        System.out.println("---------------");
                        break;
                    default:
                        System.out.println("Press 6 TO  EXIT");
                        break;

                }
                if (opt == 6) {
                    System.out.println("thank you");
                }

            }
        } else {
            System.out.println("You have entered the wrong Pin");
        }
    }

}