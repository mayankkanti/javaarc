import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the units consumed: ");
		int units = input.nextInt();
		if (units <= 50) {
			System.out.println("Your Monthly Electric Bill is " + (units * 3) + " for " + units + " at 3rs per unit");
		} else if (units > 50 && units <= 200) {
			System.out.println(
					"Your Monthly Electric Bill is " + (units * 4.80) + " for " + units + " at 4.80rs per unit");
		} else if (units > 200 && units <= 400) {
			System.out.println(
					"Your Monthly Electric Bill is " + (units * 5.80) + " for " + units + " at 5.80rs per unit");
		} else if (units > 400) {
			System.out.println(
					"Your Monthly Electric Bill is " + (units * 6.20) + " for " + units + " at 6.20rs per unit");
		}
	}

}