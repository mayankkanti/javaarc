package Assignments.SecondSemester.Assignment1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0, product = 1, q = num;
		while (q != 0) {
			int lastdigit = q % 10;
			q /= 10;

			sum += lastdigit;
			product *= lastdigit;
		}
		if (sum == product)
			System.out.println(num + " is a spy number.");
		else
			System.out.println(num + " is NOT a spy number.");
		sc.close();
	}

}
