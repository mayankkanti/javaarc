import java.util.Scanner;
public class Temp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Angle to be calculated.
		System.out.println("Enter an angle(x): ");
		double x = sc.nextDouble();
		x = x%(2*Math.PI);
		// Value of n.. (odd increment)
		int n = 1;
		// Sign of each term (alternating)
		int sign = 1;
		// Sum of each term (final result to be compared)
		double sum = 0;
		
		while (true) {
			// factorial gets reset every iteration.
			double factorial = 1;
			// Calculating Factorial
			for (int i=1; i<=n; i++) {
				factorial*=i;
			}
			// Calculating Term and Adding to sum.
			double term = sign*(Math.pow(x, n)/factorial);
			sum += term;
			// Termination condition i.e Term should be less than 10^-6
			if (Math.abs(term)<Math.pow(10, -6)) {
				break;
			}
			// Debug Statements
			//System.out.printf("x:%f n:%d factorial:%f term:%f sum:%f",x,n,factorial,term,sum);
			//System.out.println();

			
			// Increments and sign change
			sign *= -1;
			n += 2;
		}
		System.out.println("Calculated Result: "+sum);
		System.out.println("System Result: "+Math.sin(x));
	}

}
