







// This code didn't answer the question using if statements but it still functions

/*
=======
// Wrong
>>>>>>> 659199bb0d89c7c7509bc39b01d7bf99d625210a
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


/*
Enter the value of a, b, c: 10 20 30
Largest number: 30
2nd largest number: 20
 */
