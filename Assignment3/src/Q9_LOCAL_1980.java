// This code didn't answer the question using if statements but it still functions

/*
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int a = input.nextInt();
		System.out.println("Enter Number B:");
		int b = input.nextInt();
		System.out.println("Enter Number C:");
		int c = input.nextInt();
		
		int max= Math.max(a, Math.max(b, c));
		int min= Math.min(a, Math.min(b, c));
		int mid= (a+b+c)-(max+min);
		
		System.out.println("The largest number here is "+max);
		System.out.println("The 2nd largest number here is "+mid);

	}

}
*/

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of a, b, c: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int largest, secondLargest;
		if (a > b && a > c) {
			largest = a;
			secondLargest = (b > c) ? b : c;
		} else if (b > a && b > c) {
			largest = b;
			secondLargest = (a > c) ? a : c;
		} else {
			largest = c;
			secondLargest = (a > b) ? a : b;
		}
		System.out.println("Largest number: " + largest);
		System.out.println("2nd largest number: " + secondLargest);
	}
}

/*
Enter the value of a, b, c: 10 20 30
Largest number: 30
2nd largest number: 20
 */
