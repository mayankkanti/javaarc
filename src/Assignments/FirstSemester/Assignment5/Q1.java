package Assignments.FirstSemester.Assignment5;
import java.util.Scanner;
public class Q1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = input.nextInt();
		
		int sum1=0, sum2=0;
		for (int i=1; i<num1; i++) {
			if (num1%i==0) {
				sum1 += i;
			}
		}
		for (int i=1; i<num2; i++) {
			if (num2%i==0) {
				sum2 += i;
			}
		}
		if (sum1==num2 && sum2==num1) {
			System.out.printf("(%d,%d) are amicable numbers",num1,num2);
		} else {
			System.out.printf("(%d,%d) are not amicable numbers",num1,num2);
		}
		input.close();
	}
}
