package Assignments.FirstSemester.Assignment6;
import java.util.Scanner;

public class Q4 {
	public static int numberOfDaysInAYear(int year) {
		if (year%4==0 && year%100!=0 || year%400==0) {
			// the year is a leap year so 366 days
			return 366;
		} else {
			return 365;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Starting Year: ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Year: ");
		int end = sc.nextInt();
		int totaldays = 0;
		for (int i=start; i<=end; i++) {
			totaldays += numberOfDaysInAYear(i);
		}
		System.out.println("Number of days in year from "+start+" to "+end+" is "+totaldays+" days.");
		sc.close();

	}

}

