package Assignments.SecondSemester.Assignment1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your height (in meters):");
		double height = sc.nextDouble();
		System.out.print("Enter your weight (in kgs):");
		double weight = sc.nextDouble();
		double BMI = weight / Math.pow(height, 2);
		System.out.println("Your BMI is " + BMI);
		if (BMI < 18.5)
			System.out.println("The person is Underweight.");
		else if (BMI < 24.9)
			System.out.println("The person is Normal Weight.");
		else if (BMI < 29.9)
			System.out.println("The person is Overweight.");
		else if (BMI > 30)
			System.out.println("The person is Obese.");

		sc.close();
	}

}
