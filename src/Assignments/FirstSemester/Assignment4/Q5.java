import java.util.Scanner;
public class Q5 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		int sum = 0;
		for (int i = 1; i < n; i++){
			if (n%i==0) {
				sum+=i;
			}
		}
		if (sum==n) {
			System.out.println(n+" is a prefect number.");
		} else {
			System.out.println(n+" is not a prefect number.");
		}
	}
}
/*
Enter a number: 496
496 is a prefect number.
 */
