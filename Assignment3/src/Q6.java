import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the units consumed: ");
		int units = input.nextInt();
		if (units <= 50) {
			float bill = (float) (units * 3.0);
			System.out.println(
					"Your Monthly Electric Bill is " + bill);
		} else if (units > 50 && units <= 200) {
			float bill = (float) ((50*3.0)+((units-50)*4.80));
			System.out.println(
					"Your Monthly Electric Bill is " + bill);
		} else if (units > 200 && units <= 400) {
			float bill = (float) ((50*3.0)+(150*4.80)+((units-200)*5.80));
			System.out.println(
					"Your Monthly Electric Bill is " + bill);
		} else if (units > 400) {
			float bill = (float) ((50*3.0)+(150*4.80)+(200*5.80)+((units-400)*6.20));
			System.out.println(
					"Your Monthly Electric Bill is " + bill);
		}
	}                                                      

}
/*
 * Enter the units consumed: 
 * 444 
 * Your Monthly Electric Bill is 2302.8 for 444 at
 * 6.20rs per unit
 */
