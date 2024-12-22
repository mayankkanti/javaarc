import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x-coordinate: ");
		double x = input.nextDouble();
		System.out.print("Enter y-coordinate: ");
		double y = input.nextDouble();

		if (x == 0 && y == 0) {
			System.out.println("(" + x + "," + y + ")" + " is at origin.");
		} else if (x == 0) {
			System.out.println("(" + x + "," + y + ")" + " is on y-axis.");
		} else if (y == 0) {
			System.out.println("(" + x + "," + y + ")" + " is on x-axis.");
		} else if (x > 0 && y > 0) {
			System.out.println("(" + x + "," + y + ")" + " is in quadrant I.");
		} else if (x < 0 && y > 0) {
			System.out.println("(" + x + "," + y + ")" + " is in quadrant II.");
		} else if (x < 0 && y < 0) {
			System.out.println("(" + x + "," + y + ")" + " is in quadrant III.");
		} else if (x > 0 && y < 0) {
			System.out.println("(" + x + "," + y + ")" + " is in quadrant IV.");
		}

	}

}


/*
Enter x-coordinate: -34
Enter y-coordinate: 4.5
(-34.0,4.5) is in quadrant II.
 */
