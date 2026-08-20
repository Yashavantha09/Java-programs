package YNG;

import java.util.Scanner;

public class reversveAdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = n; i >= 1; i--) {
            System.out.print(i);

            if (i != 1)
                System.out.print(" + ");

            sum = sum + i;
        }

        System.out.println(" = " + sum);
    }
}