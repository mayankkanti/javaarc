package Others;
import java.util.Scanner;

public class PrimeNumInRange {
	static boolean isPrime(int num) {
		if (num <= 0) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range val1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter range val2: ");
		int num2 = sc.nextInt();

		for (int i = num1; i <= num2; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
