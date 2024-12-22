import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double bill = 0, discount, payable;
		System.out.print("No. of units consumed: ");
		int units = input.nextInt();
		if (units <= 50) {
			bill = units * 3;
			System.out.println("Your bill is " + bill);
		} else if (units > 50 & units <= 200) {
			bill = ((50 * 3) + ((units - 50) * 4.8));
			System.out.println("Your bill is " + bill);
		} else if (units > 200 & units <= 400) {
			bill = ((50 * 3) + (150 * 4.8) + ((units - 200) * 5.8));
			System.out.println("Your bill is " + bill);
		} else if (units > 400) {
			bill = ((50 * 3) + (150 * 4.8) + (200 * 5.8) + ((units - 400) * 6.2));
			
			  System.out.println("Your bill is " + bill); }
			  System.out.print("Do you want to pay online(y/n): "); char choice =
			  input.next().charAt(0);
			  
			  System.out.println("Total Amount: " + bill);
			  
			  if (choice == 'y') { discount = (bill * 3 / 100); payable = bill - discount;
			  System.out.println("Discount: " + discount);
			  System.out.println("Net payable: " + payable);
			 
		}
	}
}
