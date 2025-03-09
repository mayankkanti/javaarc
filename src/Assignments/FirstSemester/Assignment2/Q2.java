
/*
 * Author's Name: Mayank Kanti Mehta
 * Author's Redg No: 
 * Author's Semester: 1st
 * Author's Branch Section: 24E1D2
 * Subject: ICP
 * Problem Discription: Conversion of distance 
 */

import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float km, meter, feet, inch, cm;
		System.out.println("Enter the distance b/w the cities (in km):");
		km = sc.nextFloat();
		meter = km*1000;
		feet = km*3280.84f;
		inch = km*39370.08f;
		cm = km*100000;
		System.out.println("The distance b/w the cities in meters is "+meter);
		System.out.println("The distance b/w the cities in feets is "+feet);
		System.out.println("The distance b/w the cities in inches is "+inch);
		System.out.println("The distance b/w the cities in centimeters is "+cm);
	}
}
/* Output:
Enter the distance b/w the cities (in km):
200
The distance b/w the cities in meters is 200000.0
The distance b/w the cities in feets is 656168.0
The distance b/w the cities in inches is 7874015.5
The distance b/w the cities in centimeters is 2.0E7
*/
