package Assignments.FirstSemester.Assignment2;
/*
 * Author's Name: Mayank Kanti Mehta
 * Author's Redg No: 
 * Author's Semester: 1st
 * Author's Branch Section: 24E1D2
 * Subject: ICP
 * Problem Discription: calc dist travelled 
 */
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		double d, g, t;
		Scanner sc = new Scanner(System.in);
		g = 32.174d;
		System.out.print("Enter the number of seconds: ");
		t = sc.nextDouble();
		d = 0.5 * g * (t * t);
		System.out.println("Distance travelled: "+d);
		sc.close();
	}
}
/* Output:
Enter the number of seconds: 5.4
Distance travelled: 469.09692000000007
*/