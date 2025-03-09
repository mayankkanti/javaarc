/*
Author's Name: Mayank Kanti Mehta
Author's Redg no: 
Author's Semester: 1st
Author's Branch-Section: CSE-C 24E1D2
Subject: ICP
Problem Discription: Volume and Surface area calculation of the sphere.
*/


import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius, surfArea, volume;
		System.out.print("Enter the Radius of the Sphere: ");
		radius = sc.nextFloat();
		surfArea = 3 * Math.PI * Math.pow(radius, 2);
		volume = (2.0/3) * Math.PI * Math.pow(radius, 3);
		System.out.println("The Surface Area of the Sphere: " + surfArea);
		System.out.println("The Volume of the Sphere: " + volume);
	}
}

/*
Output:
Enter the Radius of the Sphere: 7
The Surface Area of the Sphere: 461.8141200776996
The Volume of the Sphere: 718.3775201208659
*/