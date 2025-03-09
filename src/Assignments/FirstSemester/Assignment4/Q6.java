package Assignments.FirstSemester.Assignment4;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the base: ");
		int base = input.nextInt();
		System.out.print("Enter the power: ");
		int power = input.nextInt();
		int sum = base;
		for (int i=1; i<power;i++) {
			sum *= base;
			System.out.println(sum);
		}
		System.out.print(base+" to the power "+power+" is: "+sum);
		input.close();
	}

}
/*
Enter the base: 5
Enter the power: 4
5 to the power 4 is: 625
*/