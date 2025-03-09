package Assignments.FirstSemester.Assignment4;
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		int output = 3;
		while (output*3<n) {
			output*=3;
		}
		System.out.println("The largest power of 3 less than or equal to "+n+" is "+output);
		input.close();
	}

}
/*
Enter a number: 100
The largest power of 3 less than or equal to 100 is 81
*/