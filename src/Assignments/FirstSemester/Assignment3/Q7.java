import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int units; // user input
		double discount = 0, payable = 0, bill = 0; // vars

		System.out.println("No. of units consumed: ");
		units = input.nextInt();
		if (units <= 50) {
			bill = (float) (units * 3.0);
			System.out.println(
					"Your Monthly Electric Bill is " + bill);
		} else if (units > 50 && units <= 200) {
			bill = (float) ((50*3.0)+((units-50)*4.80));
			System.out.println(
					"Your Monthly Electric Bill is " + bill);
		} else if (units > 200 && units <= 400) {
			bill = (float) ((50*3.0)+(150*4.80)+((units-200)*5.80));
			System.out.println(
					"Your Monthly Electric Bill is " + bill);
		} else if (units > 400) {
			bill = (float) ((50*3.0)+(150*4.80)+(200*5.80)+((units-400)*6.20));
			System.out.println(
					"Your Monthly Electric Bill is " + bill);
		}
		
		System.out.println("Do you want to pay online(y/n):");
		String choice = input.next();

		if (choice.equalsIgnoreCase("y")) {
			discount = (bill * 3 / 100);
			payable = bill - discount;
			System.out.println("Discount: " + discount);
			System.out.println("Amount payable: " + payable);
		}
		input.close();
	}
}

/*
No. of units consumed: 
444
Your Monthly Electric Bill is 2302.800048828125
Do you want to pay online(y/n):
y
Discount: 69.08400146484375
Amount payable: 2233.716047363281
*/