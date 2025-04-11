package Assignments.SecondSemester.Assignment3;

import java.util.Scanner;

public class Q9 {
    public static int reverse(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        if (n == 0) {
            return 0;
        } else { 
            return (n % 10) * (int) Math.pow(10, (int) (Integer.toString(n).length())-1) + reverse(n / 10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be reversed : ");
        int n = sc.nextInt();
        System.out.println("The reverse of " + n + " is: " + reverse(n));
        sc.close();
    }
}
