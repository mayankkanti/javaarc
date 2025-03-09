package Assignments.FirstSemester.Assignment6;
import java.util.Scanner;
public class HAQ3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String user = sc.nextLine();
		System.out.println("The middle character in the string: "+user.charAt((user.length()/2)));
	}

}

