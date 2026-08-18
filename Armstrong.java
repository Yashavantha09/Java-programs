package Yashavantha;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), temp = n, sum = 0;

        while (n > 0) {
            int r = n % 10;
            System.out.println(r + "^3 = " + r*r*r);
            sum += r*r*r;
            n /= 10;
        }

        System.out.println("Sum = " + sum);

        if (sum == temp)
            System.out.println(temp + " is Armstrong Number");
        else
            System.out.println(temp + " is Not Armstrong Number");
    }
}