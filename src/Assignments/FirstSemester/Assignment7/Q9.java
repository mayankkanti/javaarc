package Assignments.FirstSemester.Assignment7;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[10];

		int n = 10;
		double sum = 0;
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}

		double mean = sum / n;
		System.out.println("The mean is " + mean);

		double numerator = 0;

		for (int i = 0; i < n; i++) {
			numerator += Math.pow((arr[i] - mean), 2);
		}

		double deviation = Math.sqrt((numerator / (n - 1)));
		System.out.println("The standard deviation is " + deviation);
		sc.close();
	}

}
