package Assignments.FirstSemester.Assignment2;
/*
 * Author's Name: Mayank
 * Author's Redg No: 
 * Author's Semester: 1st
 * Author's Branch Section: 24E1D2
 * Subject: ICP
 * Problem Discription:  Sum of digits entered
 */
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var, lastdig, middledig, firstdig, temp, sum;
		System.out.print("Enter a number b/w 0 - 1000: ");
		var = sc.nextInt(); // explanation, say 353
		lastdig = var % 10; // here 3
		temp = var / 10; // here 35
		middledig = temp % 10; // here 5
		firstdig = temp / 10; // here 3
		sum = firstdig + middledig + lastdig; // adding 3+5+3=11
		System.out.println("The sum of the digits entered is "+sum);
		sc.close();
	}
}
/*
Output:
Enter a number b/w 0 - 1000: 353
The sum of the digits entered is 11
*/
