package Assignments.FirstSemester.Assignment5;
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number n: ");
		int n = sc.nextInt();
		double sum = 0;
		for (int i=1; i<=n; i++) {
			double term = 1/(Math.pow(i,2));
			sum += term;
		}
		System.out.println("The Sum is : "+sum);
		sc.close();

	}

}

