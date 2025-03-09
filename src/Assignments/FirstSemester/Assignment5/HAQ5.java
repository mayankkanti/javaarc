package Assignments.FirstSemester.Assignment5;
import java.util.Scanner;

public class HAQ5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms (n): ");
		int n = sc.nextInt();
		int first = 0, second = 1;
		if (n <= 0) {
			System.out.println("Only positive numbers.");
		}

		if (n == 1) {
			System.out.println("Fibonacci Series is: 0");
		} else if (n == 2) {
			System.out.println("Fibonacci Series is: 0, 1");
		} else {
			System.out.print("Fibonacci Series is: 0, 1, ");
			for (int i = 1; i <= n - 2; i++) {
				int next = first + second;
				System.out.print(next);
				first = second;
				second = next;
				// Prettying the code
				if (i != n - 2) {
					System.out.print(", ");
				} else {
					System.out.print(".");
				}
			}
		}
		sc.close();
	}

}

