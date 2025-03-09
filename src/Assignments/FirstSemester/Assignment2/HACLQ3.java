package Assignments.FirstSemester.Assignment2;
/*Write a java program to input a four-digit number from command line argument and find sum
of the first and last digit of the number*/
public class HACLQ3 {
	public static void main(String[] args) {
		int digit = Integer.parseInt(args[0]);
		int firstDigit = digit / 1000;
		int secondDigit = digit % 10;
		System.out.println("The sum of firstdigit and lastdigit is "+(firstDigit+secondDigit));
	}
}