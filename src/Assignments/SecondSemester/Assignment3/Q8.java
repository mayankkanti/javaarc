package Assignments.SecondSemester.Assignment3;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int x = sc.nextInt();
        System.out.print("Enter power value: ");
        int n = sc.nextInt();
        System.out.println("The result of " + x + "^" + n + " is: " + power(x, n));
        sc.close();
    }
    public static long power(int x, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Power must be non-negative.");
        }
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
}
