package Assignments.FirstSemester.Assignment6;
import java.util.Scanner;
public class Q3 {
	public static int reverse(int number) {
		int result = 0;
		int num = number;
		int index = Integer.toString(num).length()-1;
		while (num!=0) {
			int bit = num%10;
			num = num/10;
			result += (bit*Math.pow(10,index));
			index--;
		}
		return result;
	}
	
	public static boolean isPalindrome(int number) {
		boolean result;
		if (number == reverse(number)) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (int): ");
		int n = sc.nextInt();
		if (n==0) {
			System.out.println("The Entered Number can not be zero.");
		}
		System.out.println("Reversed Number: "+reverse(n));
		System.out.println("Is the number palindrome? "+isPalindrome(n));

	}

}

