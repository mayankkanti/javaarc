package Assignments.FirstSemester.Assignment3;
import java.util.Scanner;
public class HAQ5 {
	public static void main(String[] args) {
		String firstName, lastName;
		char gender, married;
		int age;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your gender (M or F):");
		gender = input.next().charAt(0);
		System.out.println("First name:");
		firstName = input.next();
		System.out.println("Last name:");
		lastName = input.next();
		System.out.println("Age");
		age = input.nextInt();
		if (gender == 'F' && age >= 20) {
			System.out.println("Are you married, Gita (y or n)?");
			married = input.next().charAt(0);
			if (married == 'y') {
				System.out.println("Then I shall call you Mrs. "+firstName+" "+lastName);
			} else {
				System.out.println("Then I shall call you Ms. "+firstName);
			}
		} else if (gender == 'F' && age <= 20) {
			System.out.println("Then I shall call you "+firstName+" "+lastName);
		} else if (gender == 'M' && age >= 20) {
			System.out.println("Then I shall call you Mr. "+ firstName);
		} else {
			System.out.println("Then I shall call "+firstName+" "+lastName);
		}
		input.close();
	}
}