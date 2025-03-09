package Assignments.FirstSemester.Assignment5;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Inputs
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		System.out.printf("The prime number between %d and %d are:  ", num1, num2);

		for (int num = num1; num < num2; num++) {

			boolean isnumprime = true;

			for (int idx = 2; idx <= Math.sqrt(num); idx++) {
				if (num % idx == 0) {
					isnumprime = false;
					break;
				}
			}
			if (isnumprime) {
				System.out.print(num + " ");
			}
		}
		sc.close();
	}
}

