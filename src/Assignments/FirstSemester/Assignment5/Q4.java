package Assignments.FirstSemester.Assignment5;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of m: ");
		int m = sc.nextInt();
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		int factorialsum = 1;
		for (int i = m; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				factorialsum *= j;
//				System.out.printf("[Debug] m:%d n:%d i:%d j:%d factorialsum:%d", m, n, i, j, factorialsum);
//				System.out.println();
			}
			System.out.printf("Factorial of %d is: %d", i, factorialsum);
			System.out.println();
			factorialsum = 1;
		}
		sc.close();
	}

}

