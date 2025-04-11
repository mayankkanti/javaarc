package Assignments.SecondSemester.Assignment3;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want the factorial of: ");
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is: " + factorial(n));
        sc.close();
        
    }
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
        
    }

}
