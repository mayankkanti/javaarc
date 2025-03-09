package Assignments.FirstSemester.Assignment5;
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number n: ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.print("The sequence till "+n+" is: "+a+" "+b+" "+c+" ");
		for (int i=1; i<=(n-3); i++) {
			// since we already know the first three terms so n-3
			int temp = a + b + c;
			System.out.print(temp+" ");
			a = b;
			b = c;
			c = temp;
		}

	}

}

