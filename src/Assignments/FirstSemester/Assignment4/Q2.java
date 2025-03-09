package Assignments.FirstSemester.Assignment4;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		int sum = 0, bit, num;
		num = n;
		while (n > 0) {
			bit = n % 10;
			n = n / 10;
			sum += bit;
		}
		if (sum % 9 == 0) {
			System.out.println("The number " + num + " is divisible by 9");
		} else {
			System.out.println("The number " + num + " is not divisible by 9");
		}
		input.close();
	}
}
/*
Enter a number: 123456
The number 123456 is not divisible by 9
*/
