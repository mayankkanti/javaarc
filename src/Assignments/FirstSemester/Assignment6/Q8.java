package Assignments.FirstSemester.Assignment6;
import java.util.Scanner;
public class Q8 {
	public static boolean isPalindrome(String Str) {
		String reversed = "";
		for (int i=Str.length()-1; i>=0; i--) {
			reversed += Str.charAt(i);
		}
		if (reversed.equals(Str)) {
			return true;
		} else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userinput = sc.nextLine();
		System.out.println("Is the inputted String a palindrome? "+isPalindrome(userinput));
		sc.close();
	}

}

