package YNG;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("1.Add  2.Subtract  3.Multiply  4.Divide");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Result = " + (a + b));
            case 2 -> System.out.println("Result = " + (a - b));
            case 3 -> System.out.println("Result = " + (a * b));
            case 4 -> System.out.println("Result = " + (a / b));
            default -> System.out.println("Invalid choice");
        }
    }
}