package Assignments.SecondSemester.Assignment3;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term : ");
        int n = sc.nextInt();
        System.out.print("The Fibonacci Number" + n + "th term is: ");
        System.out.println(fibonacci(n));
        sc.close();

    }
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
