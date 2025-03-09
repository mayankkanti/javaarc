package Assignments.FirstSemester.Assignment5;
import java.util.Scanner;
public class HAQ4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the angle (x): ");
		double x = sc.nextDouble();
		x = x % (2 * Math.PI);
		int n = 0;
		double sum = 0;
		int sign = 1;
		
		while (true){
			// Calc factorial 
			double factorial = 1.0d;
			for (double i = 1.0; i <= n; i++) {
			    factorial *= i;
			}
			
            double term = sign * (Math.pow(x, n) / factorial);
            sum += term;
			
			System.out.printf("[Debug] x: %f n:%d factorial: %f term: %f sum: %f", x, n, factorial, term, sum);
			System.out.println();
			
			// termination condition
            if (Math.abs(term) < Math.pow(10, -6)) {
                break;
            }
            
			n=n+2; // change terms odd numbers
			sign *= -1; // flip sign every iteration
		}
		System.out.println("Calculated result: "+sum);
		System.out.println("System result: "+Math.cos(x));
		
		sc.close();
	}

}

