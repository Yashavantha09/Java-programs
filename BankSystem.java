package Yashugowa;

import java.util.Scanner;

class BankSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;
        int choice, amount;

        while (true) {

            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Balance");
            System.out.println("4.Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    amount = sc.nextInt();
                    balance += amount;
                    System.out.println("Deposit successful");
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    amount = sc.nextInt();

                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdraw successful");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;

                case 3:
                    System.out.println("Balance = ₹" + balance);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}