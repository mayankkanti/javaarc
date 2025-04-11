package Assignments.SecondSemester.Assignment1;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		if (isOdd(num))
			System.out.println("The number is odd.");
		else
			System.out.println("The number is even.");
		sc.close();
	}

	public static boolean isOdd(int num) {
		if ((num & 1) == 1)
			return true;
		return false;
	}
}
