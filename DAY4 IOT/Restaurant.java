package YNG;
import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Restaurant Menu -----");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Sandwich");
        System.out.println("4. Pasta");
        System.out.println("5. Mudde Saru");

        System.out.print("Enter your choice (1-5): ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("You ordered Pizza");
                break;

            case 2:
                System.out.println("You ordered Burger");
                break;

            case 3:
                System.out.println("You ordered Sandwich");
                break;

            case 4:
                System.out.println("You ordered Pasta");
                break;

            case 5:
                System.out.println("You ordered Mudde Saru");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}