package Assignments.FirstSemester.Assignment6;
// This question makes no sense if its gonna not-repeated then the character will always be the first char(technically, not the same pos but yea)

import java.util.Scanner;
public class HAQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		// ensuring the that the string has atleast 2 chars
		while(input.length()<2) {
			System.out.println("The String should atleast contain 2 characters!");
			System.out.println("Enter a string: ");
			input = sc.nextLine();
		}
		
		boolean notfound = true;
		
		for (int i=1; i<input.length(); i++) {
			char letter1 = input.charAt(i-1);
			char letter2 = input.charAt(i);
			
			if (letter1 != letter2) {
				System.out.println("The first non-repeated character in the inputted string is "+letter1);
				notfound = false;
				break;
			}
		}
		
		if (notfound) {
			System.out.println("There are no non-repeated character in the inputted string.");
		}

	}

}

