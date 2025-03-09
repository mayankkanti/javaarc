package Assignments.FirstSemester.Assignment4;
import java.util.Scanner;

public class Q3 {   

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, sum = 0, randNum, count = 0;
		System.out.print("Enter a number: ");
		n = input.nextInt();
		System.out.print("Random  Number generated are: ");
		do {
			randNum = (int) (Math.random() * (n) + 1);
			System.out.print(randNum + " ");
			sum += randNum;
			count++; 
		} while (count < n);
		System.out.println();
		System.out.println("Average of " + n + " random numbers are " + (sum / n));
		input.close();
	}

}