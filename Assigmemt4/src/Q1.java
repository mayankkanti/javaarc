import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int firstNum = input.nextInt();
		System.out.print("Enter second number: ");
		int secondNum = input.nextInt();
		System.out.print("Enter third number: ");
		int thirdNum = input.nextInt();
		int sum = 0;
		for (int i = firstNum ;i <= secondNum; i+=thirdNum) {
			System.out.print(i+" ");
			sum+=i;
		}
		System.out.println();
		System.out.println("The sum of number displayed is "+sum);
	}
}
/*
Enter first number: 2
Enter second number: 18
Enter third number: 2
2 4 6 8 10 12 14 16 18 
The sum of number displayed is 90
*/