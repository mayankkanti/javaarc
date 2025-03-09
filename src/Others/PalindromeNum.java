import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int q = num, reversedNum = 0, bit;
		while (q != 0) {
			bit = q % 10;
			reversedNum = reversedNum * 10 + bit;
			q = q / 10;
		}
		if (reversedNum == num) {
			System.out.println("Yes, the number is a palindrome number.");
		} else {
			System.out.println("No, the number is not a palindrome number.");
		}
	}

}
