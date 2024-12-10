import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Age (int): ");
		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible to cast your vote.");
		}
	}
}
/* 
 * 
 * Enter Your Age (int): 
 * 19 
 * You are eligible to cast your vote.
 */