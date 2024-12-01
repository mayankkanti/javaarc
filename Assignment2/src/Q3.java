
/*
 * Author's Name: Mayank Kanti Mehta
 * Author's Redg No: 
 * Author's Semester: 1st
 * Author's Branch Section: 24E1D2
 * Subject: ICP
 * Problem Discription: Salary Problems HRA,DA,GSalary Calcs
 */
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salary, DA, HRA, Gsalary;
		System.out.println("Enter Your Salary: ");
		salary = sc.nextFloat();
		DA = salary * 40/100;
		HRA = salary * 20/100;
		Gsalary = salary - (DA+HRA);
		System.out.println("Your HRA (40%) is "+HRA);
		System.out.println("Your DA (20%) is "+DA);
		System.out.println("Your Gross Salary is "+Gsalary);
	}
}
/*
Output:
Enter Your Salary: 
350000.25
Your HRA (40%) is 70000.05
Your DA (20%) is 140000.1
Your Gross Salary is 140000.11
*/