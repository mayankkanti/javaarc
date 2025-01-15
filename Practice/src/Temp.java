import java.util.Scanner;
public class Temp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		System.out.print("Enter the angle to be calculated: ");
		double x = sc.nextDouble();
		
		x = x % (2* Math.PI);
		double sign = 1.0;
		double sum = 0.0d;
		while (true) {
			// Resetting Factorial for each iteration
			double factorial = 1;
	
			// Calculating factorial
			for (int i=1; i<=n; i++) {
				factorial *= i;
			}
			
			// Calculating term
			double term = sign*(Math.pow(x,n)/factorial);
			
			// Calculating sum
			sum += term;
			
			System.out.printf("[Debug] x:%f n:%d factorial:%f term:%f sum:%f",x,n,factorial, term, sum);
			System.out.println();
			
			// Termination Condition
			if (Math.abs(term)<Math.pow(10, -6)) {
				break;
			}
			
			// Increments and Sign Changes
			n+=2;
			sign = sign * -1;
			
		}
		System.out.println("Calculated Sin(x): "+sum);
		System.out.println("System Sin(x): "+Math.sin(x));
	}

}
