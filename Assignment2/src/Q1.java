
/*
 * Author's Name: Mayank Kanti Mehta
 * Author's Redg No: 
 * Author's Semester: 1st
 * Author's Branch Section: 24E1D2
 * Subject: ICP
 * Problem Discription: Conversion of temperatures (F to C)
 */
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double f,c;
		System.out.print("Enter the temperature in F:");
		f = sc.nextDouble();		
		c = (f-32)*(5.0/9);
		System.out.println("The temperature in C is "+c);	
	}
}

/*
 * Output: 
 * Enter the temperature in F:23
 * The temperature in C is -5.0
 */