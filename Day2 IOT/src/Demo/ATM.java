package Demo;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String name = "";
        int salary = 0;
        do {
            System.out.println("\n===== ATM =====");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter name: ");
                name = sc.next();
                System.out.print("Enter salary: ");
                salary = sc.nextInt();
                System.out.println("Created Successfully");
            } else if (choice == 2) {
                System.out.println("Name: " + name);
                System.out.println("Salary: " + salary);
            } else if (choice == 3) {
                System.out.print("Enter salary increase: ");
                int increase = sc.nextInt();
                salary = salary + increase;
                System.out.println("New Salary: " + salary);
            } else if (choice == 4) {
                System.out.println("Thank You!");
            } else {
                System.out.println("Invalid Choice");
            }
        } while (choice != 4);
        sc.close();
    }
}