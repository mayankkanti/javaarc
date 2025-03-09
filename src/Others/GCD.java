package Others;
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second Number: ");
		int num2 = sc.nextInt();

		int divisor = Math.min(num1, num2);
		int dividend = Math.max(num1, num2);

		int temp = 1;

		while (temp != 0) {
			temp = dividend % divisor;
			dividend = divisor;
			divisor = temp;
			// System.out.println(String.format("[Debug] Temp: %d Dividend: %d Divisor: %d",
			// temp, dividend, divisor));
		}

		System.out.println("The GCD of the numbers " + num1 + " and " + num2 + " is " + dividend);
		sc.close();
	}

}
