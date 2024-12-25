// Print the square root of the number. Exit the program if 0 is entered.
import java.util.Scanner;
public class OutputSquareRoot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a number: ");
			int num = input.nextInt();
			if (num == 0) {
				System.out.println("Program Exited.");
				break;
			}
			else {
				System.out.println("Square Root: "+Math.sqrt(num));
			}
		}
	}
}
