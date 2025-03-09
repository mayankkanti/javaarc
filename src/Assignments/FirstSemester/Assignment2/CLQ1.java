package Assignments.FirstSemester.Assignment2;

/* Write a java program that takes two int values from the command line as dividend and divisor 
and print the quotient and remainder */
public class CLQ1 {
	public static void main(String[] args) {
		int dividend, divisor, quotient, remainder;
		dividend = Integer.parseInt(args[0]);
		divisor = Integer.parseInt(args[1]);
		quotient = dividend/divisor;
		remainder = dividend%divisor;
		System.out.println("Entered Dividend is "+dividend+", entered divisor is "+quotient);
		System.out.println("Quotient is "+quotient+", remainder is "+remainder);
	}
}