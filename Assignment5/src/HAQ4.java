import java.util.Scanner;
public class HAQ4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the angle (x): ");
		double x = sc.nextDouble();
		
		int n = 0;
		double sum = 0;
		int sign = 1;
		
		while (true){
			// Calc factorial 
			long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
			
            double term = sign * (Math.pow(x, n) / factorial);
            sum += term;
			
			System.out.printf("[Debug] x: %f n:%d factorial: %d term: %f sum: %f", x, n, factorial, term, sum);
			System.out.println();
						
            if (Math.abs(term) < Math.pow(10, -6)) {
                break;
            }
            
			n=n+2; // change terms even numbers
			sign *= -1; // flip sign every iteration
		}
		System.out.println("Calculated result: "+sum);
		System.out.println("System result: "+Math.cos(x));
		
		
	}

}