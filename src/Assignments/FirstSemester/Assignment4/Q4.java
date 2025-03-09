package Assignments.FirstSemester.Assignment4;
import java.util.Scanner;
public class Q4 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int firstNum  = input.nextInt();
		System.out.print("Enter the second number: ");
		int secondNum  = input.nextInt();
		System.out.print("GCD of "+firstNum+" and "+secondNum+" is ");
		while (secondNum != 0) { 
			int temp = firstNum%secondNum;
			firstNum = secondNum;
			secondNum = temp;
		}
		System.out.print(firstNum);
		input.close();
	}
}
/*
Enter the first number: 56
Enter the second number: 98
GCD of 56 and 98 is 14.
*/