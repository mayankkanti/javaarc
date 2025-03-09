package Assignments.FirstSemester.Assignment6;
import java.util.Scanner;

public class Q1 {
	public static int additionSimple(int x, int y) {
		int result = x + y;
		return result;
	}

	public static int subtractionSimple(int x, int y) {
		int result = y - x;
		return result;
	}

	public static int multiplicationSimple(int x, int y) {
		int result = x * y;
		return result;
	}

	public static double divisionSimple(int x, int y) {
		if (x == 0) {
			System.out.println("Number x can't be zero for division!");
			return 0;
		} else {
			int result = y / x;
			return result;
		}
	}

	public static int remainderSimple(int n, int m) {
		int result = m % n;
		return result;
	}

	public static double squareRootSimple(int n) {
		if (n < 0) {
			System.out.println("The result is complex as the number is negative.");
			return 0;
		} else {
			double result = Math.sqrt(n);
			return result;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// taking 0 - addition, 1 - subtraction, 2 - multiplication, 3 - division, 4 -
		// remainder, 5 - Square root

		int n;
		do {
			System.out.println("Calculator Functions: ");
			System.out.println("0 - Addition (x+y)");
			System.out.println("1 - Subtraction (y-x)");
			System.out.println("2 - Multiplication (x*y)");
			System.out.println("3 - Division (y/x)");
			System.out.println("4 - Remainder (y%x)");
			System.out.println("5 - Square root (sqrt(x))");
			System.out.println("6 - Exit");
			System.out.print("Enter your Choice:");
			n = sc.nextInt();

			if (n >= 0 && n <= 4) {
				System.out.println("You selected option " + n);
				System.out.print("Enter value x: ");
				int x = sc.nextInt();
				System.out.print("Enter value y: ");
				int y = sc.nextInt();

				switch (n) {
				case 0:
					System.out.println(x + " + " + y + " = " + additionSimple(x, y));
					break;
				case 1:
					System.out.println(y + " - " + x + " = " + subtractionSimple(x, y));
					break;
				case 2:
					System.out.println(x + " x " + y + " = " + multiplicationSimple(x, y));
					break;
				case 3:
					System.out.println(y + " / " + x + " = " + divisionSimple(x, y));
					break;
				case 4:
					System.out.println(y + " % " + x + " = " + remainderSimple(x, y));
					break;
				}
			} else if (n == 5) {
				System.out.println("You selected option " + n);
				System.out.print("Enter value x: ");
				int x = sc.nextInt();
				System.out.println("Sqaure root of " + x + " = " + squareRootSimple(x));
			} else if (n == 6) {
				System.out.println("Exiting Program...");
				break;
			} else {
				System.out.println("Invalid choice. Please try again.");
			}

		} while (true);
		sc.close();

	}

}

